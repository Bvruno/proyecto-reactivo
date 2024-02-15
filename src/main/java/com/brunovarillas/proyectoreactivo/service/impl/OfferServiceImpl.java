package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.repository.OfferRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import com.brunovarillas.proyectoreactivo.service.OfferService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {
    private final OfferRepository offerRepository;
    @Override
    public Mono<OfferDto> createOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Mono<OfferDto> updateOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Mono<OfferDto> deleteOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Mono<OfferDto> getOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Flux<OfferDto> getAllOffers() {
        return null;
    }

    @Override
    public Flux<OfferDto> getOffersByProduct(OfferDto offerDto) {
        return null;
    }
}
