package com.brunovarillas.proyectoreactivo.repository;

import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ShopRepository extends R2dbcRepository<ShopEntity, Integer> {
}
