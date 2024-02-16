package com.brunovarillas.proyectoreactivo.repository;

import com.brunovarillas.proyectoreactivo.repository.entity.PurchaseDetailEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface PurchaseDetailRepository extends R2dbcRepository<PurchaseDetailEntity, Integer> {
    Flux<PurchaseDetailEntity> findByDate(Long date);
    Flux<PurchaseDetailEntity> findByStatus(StateSale status);
}
