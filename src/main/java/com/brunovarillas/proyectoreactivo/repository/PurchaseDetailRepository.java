package com.brunovarillas.proyectoreactivo.repository;

import com.brunovarillas.proyectoreactivo.repository.entity.PurchaseDetailEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface PurchaseDetailRepository extends R2dbcRepository<PurchaseDetailEntity, Integer> {
}
