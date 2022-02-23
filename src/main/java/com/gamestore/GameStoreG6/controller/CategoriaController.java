package com.gamestore.GameStoreG6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.gamestore.GameStoreG6.model.CategoriaModel;
import com.gamestore.GameStoreG6.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	public CategoriaRepository repository;
	
	@GetMapping("/all")
	public ResponseEntity<List<CategoriaModel>> getAll(){
		List<CategoriaModel> list = repository.findAll();
		if(list.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Erro, tente novamente.");
		} else {
			return ResponseEntity.ok(repository.findAll());
		}
	}
	
	
}
