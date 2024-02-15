package com.brunovarillas.proyectoreactivo.repository;

import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface OfferRepository extends R2dbcRepository<OfferEntity, Integer> {
    Flux<OfferEntity> findByProductId(Integer productId);
}
