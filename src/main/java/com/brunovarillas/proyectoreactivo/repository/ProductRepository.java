package com.brunovarillas.proyectoreactivo.repository;

import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ProductRepository extends R2dbcRepository<ProductEntity, Integer> {
}
