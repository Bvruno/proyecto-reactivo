package com.brunovarillas.proyectoreactivo.repository;

import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface OrderRepository extends R2dbcRepository<OrderEntity, Integer> {
}
