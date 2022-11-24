package com.juanprimeiroprojeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanprimeiroprojeto.curso.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
