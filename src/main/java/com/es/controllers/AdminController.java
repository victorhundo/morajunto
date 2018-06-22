package com.es.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.models.Admin;
import com.es.responses.Response;
import com.es.services.AdminService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/Admins")
@Api("Controlador do administrador")
public class AdminController {
	
	private AdminService adminService;
	
	@ApiOperation(value = "Método que cria um novo usuario")
	@PostMapping
	public ResponseEntity<Response<Admin>> create(@Valid @RequestBody Admin admin, BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Admin>(errors));
		}
		return ResponseEntity.ok(new Response<Admin>(this.adminService.create(admin)));
	}

	@ApiOperation(value = "Altera os dados do Usuário com o ID passado como parametro")
	@PutMapping(path = "{id}")
	public ResponseEntity<Response<Boolean>> update(@Valid @PathVariable String id, @RequestBody Admin admin,
			BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Boolean>(errors));
		}
		admin.setId(id);
		return ResponseEntity.ok(new Response<Boolean>(this.adminService.update(admin)));
	}

	@ApiOperation(value = "Exclui um usuario com ID passado como parametro")
	@DeleteMapping(path = "{id}")
	public ResponseEntity<Response<Integer>> delete(@PathVariable(name = "id") Admin id) {
		this.adminService.delete(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

}
