package com.es.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.controllers.UserController.LoginResponse;
import com.es.models.User;
import com.es.responses.Response;
import com.es.services.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/users")
@Api("Controlador de usuario")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "Método que retorna todos os usuarios cadastrados")
	@GetMapping
	public ResponseEntity<Response<List<User>>> findaAll() {
		return ResponseEntity.ok(new Response<List<User>>(this.userService.findAll()));
	}

	@ApiOperation(value = "Método que retorna o usuario pelo id passado como parametro")
	@GetMapping(path = "{username}")
	public ResponseEntity<Response<User>> getByUsername(@PathVariable(name = "username") String username) {
		return ResponseEntity.ok(new Response<User>(this.userService.getByUsername(username)));
	}

	@ApiOperation(value = "Método que cria um novo usuario")
	@PostMapping
	public ResponseEntity<Response<User>> create(@Valid @RequestBody User user, BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<User>(errors));
		}
		return ResponseEntity.ok(new Response<User>(this.userService.create(user)));
	}

	@ApiOperation(value = "Altera os dados do Usuário com o ID passado como parametro")
	@PutMapping(path = "{id}")
	public ResponseEntity<Response<Boolean>> update(@Valid @PathVariable String id, @RequestBody User user,
			BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Boolean>(errors));
		}
		user.setId(id);
		return ResponseEntity.ok(new Response<Boolean>(this.userService.update(user)));
	}

	@ApiOperation(value = "Exclui um usuario com ID passado como parametro")
	@DeleteMapping(path = "{id}")
	public ResponseEntity<Response<Integer>> delete(@PathVariable(name = "id") User id) {
		System.out.println(id);
		this.userService.delete(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

	@ApiOperation(value = "Verifica dados para fazer login do usuário")
	@PostMapping(path = "{username}/{password}")
	public ResponseEntity<LoginResponse> login(@PathVariable(name = "username") String username, @PathVariable(name = "password") String password) throws Exception {
		User user = this.userService.login(username, password);
		if(user == null){
			throw new Exception("Usuario não existe");
		}else if(!user.getPassword().equals(password) || !user.getUsername().equals(username)){
			throw new Exception("Usuario ou senha invalida");
		} else{
			String token = Jwts.builder().setSubject(user.getUsername())
					.signWith(SignatureAlgorithm.HS512, "secretkey")
					.setExpiration(new Date(System.currentTimeMillis() + 10 * 60 * 1000)).compact();

			return ResponseEntity.ok(new LoginResponse(token, user));
		}
		
	}
	
	public class LoginResponse {
		public String token;
		public User user;

		public LoginResponse(String token,User user) {
			this.token = token;
			this.user = user;
		}

	}

}
