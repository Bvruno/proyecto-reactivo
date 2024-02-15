package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/offer")
@RequiredArgsConstructor
public class OfferController {
    private final OfferService offerService;

    @GetMapping
    public Mono<OfferDto> getOffer(@RequestHeader Integer offerId) {
        return offerService.getOffer(offerId);
    }

    @GetMapping("/all")
    public Flux<OfferDto> getAllOffers() {
        return offerService.getAllOffers();
    }

    @PostMapping
    public Mono<OfferDto> createOffer(@RequestBody OfferDto offerDto) {
        return offerService.createOffer(offerDto);
    }

    @PutMapping
    public Mono<OfferDto> updateOffer(@RequestBody OfferDto offerDto) {
        return offerService.updateOffer(offerDto);
    }

    @DeleteMapping
    public Mono<OfferDto> deleteOffer(@RequestBody OfferDto offerDto) {
        return offerService.deleteOffer(offerDto);
    }

    @GetMapping("/product")
    public Flux<OfferDto> getOffersByProduct(@RequestBody OfferDto offerDto) {
        return offerService.getOffersByProduct(offerDto);
    }
}
