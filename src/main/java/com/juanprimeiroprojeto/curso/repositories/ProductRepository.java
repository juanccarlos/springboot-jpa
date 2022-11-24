package com.juanprimeiroprojeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanprimeiroprojeto.curso.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
