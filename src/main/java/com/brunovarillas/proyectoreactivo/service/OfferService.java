package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OfferService {
    Mono<OfferDto> createOffer(OfferDto offerDto);
    Mono<OfferDto> updateOffer(OfferDto offerDto);
    Mono<OfferDto> deleteOffer(OfferDto offerDto);
    Mono<OfferDto> getOffer(Integer offerId);
    Flux<OfferDto> getAllOffers();
    Flux<OfferDto> getOffersByProduct(OfferDto offerDto);
}
