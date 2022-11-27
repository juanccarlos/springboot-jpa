package com.juanprimeiroprojeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanprimeiroprojeto.curso.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
