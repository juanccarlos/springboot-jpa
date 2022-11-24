package com.juanprimeiroprojeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanprimeiroprojeto.curso.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
