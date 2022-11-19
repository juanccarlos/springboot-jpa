package com.juanprimeiroprojeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanprimeiroprojeto.curso.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
