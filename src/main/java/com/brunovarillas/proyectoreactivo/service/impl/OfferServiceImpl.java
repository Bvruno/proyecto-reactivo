package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.repository.OfferRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import com.brunovarillas.proyectoreactivo.service.OfferService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {
    private final OfferRepository offerRepository;
    @Override
    public Mono<OfferEntity> createOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Mono<OfferEntity> updateOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Mono<OfferEntity> deleteOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Mono<OfferEntity> getOffer(OfferDto offerDto) {
        return null;
    }

    @Override
    public Mono<OfferEntity> getAllOffers() {
        return null;
    }

    @Override
    public Mono<OfferEntity> getOffersByProduct(OfferDto offerDto) {
        return null;
    }
}
