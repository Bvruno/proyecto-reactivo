package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import reactor.core.publisher.Mono;

public interface OfferService {
    Mono<OfferEntity> createOffer(OfferDto offerDto);
    Mono<OfferEntity> updateOffer(OfferDto offerDto);
    Mono<OfferEntity> deleteOffer(OfferDto offerDto);
    Mono<OfferEntity> getOffer(OfferDto offerDto);
    Mono<OfferEntity> getAllOffers();
    Mono<OfferEntity> getOffersByProduct(OfferDto offerDto);
}
