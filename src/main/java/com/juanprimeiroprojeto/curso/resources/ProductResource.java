package com.juanprimeiroprojeto.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanprimeiroprojeto.curso.entites.Product;
import com.juanprimeiroprojeto.curso.services.ProductServices;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductServices service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findall(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	 @GetMapping(value = "/{id}")
	 public ResponseEntity<Product> findById(@PathVariable Long id ){
		 Product obj = service.findById(id);
		 return ResponseEntity.ok().body(obj);
	 }
}
