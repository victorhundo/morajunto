package com.es.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

import com.es.models.Advertisement;
import com.es.responses.Response;
import com.es.services.Advertisement.AdvertisementService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/advertisements")
@Api("Controlador de anuncios")
public class AdvertisementController {
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@ApiOperation(value = "Método que retorna todos os anuncios cadastrados")
	@GetMapping
	public ResponseEntity<Response<List<Advertisement>>> findaAll() {
		return ResponseEntity.ok(new Response<List<Advertisement>>(this.advertisementService.findAll()));
	}

	@ApiOperation(value = "Método que retorna o anuncio pelo id passado como parametro")
	@GetMapping(path = "{id}")
	public ResponseEntity<Response<Optional<Advertisement>>> getById(@PathVariable(name = "id") String advertisementID) {
		return ResponseEntity.ok(new Response<Optional<Advertisement>>(this.advertisementService.getById(advertisementID)));
	}

	@ApiOperation(value = "Método que cria um novo anuncio")
	@PostMapping
	public ResponseEntity<Response<Advertisement>> create(@Valid @RequestBody Advertisement advertisement, BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Advertisement>(errors));
		}
		return ResponseEntity.ok(new Response<Advertisement>(this.advertisementService.create(advertisement)));
	}

	@ApiOperation(value = "Altera os dados do anuncio com o ID passado como parametro")
	@PutMapping(path = "{id}")
	public ResponseEntity<Response<Boolean>> update(@Valid @PathVariable String id, @RequestBody Advertisement advertisement,
			BindingResult result) {
		if (result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> errors.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Boolean>(errors));
		}
		advertisement.setId(id);
		return ResponseEntity.ok(new Response<Boolean>(this.advertisementService.update(advertisement)));
	}

	@ApiOperation(value = "Exclui um anuncio com ID passado como parametro")
	@DeleteMapping(path = "{id}")
	public ResponseEntity<Response<Integer>> delete(@PathVariable(name = "id") Advertisement id) {
		this.advertisementService.delete(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

	@ApiOperation(value = "Método que retorna os anuncios pelo username passado como parametro")
	@GetMapping(path = "/getadvertisement/{username}")
	public ResponseEntity<Response<List<Advertisement>>> getByUsername(@PathVariable(name = "username") String username) {
		return ResponseEntity.ok(new Response<List<Advertisement>>(this.advertisementService.getByUsername(username)));
	}
}
