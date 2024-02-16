package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.CreateOfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.DeleteOfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.UpdateOfferDto;
import com.brunovarillas.proyectoreactivo.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/offer")
@RequiredArgsConstructor
public class OfferController {
    private final OfferService offerService;

    @GetMapping("/{offerId}")
    public Mono<OfferDto> getOffer(@RequestParam Integer offerId) {
        return offerService.getOffer(offerId);
    }

    @GetMapping
    public Flux<OfferDto> getAllOffers() {
        return offerService.getAllOffers();
    }

    @PostMapping
    public Mono<OfferDto> createOffer(
            @RequestHeader Integer shopId,
            @RequestBody CreateOfferDto offerDto) {
        return offerService.createOffer(offerDto, shopId);
    }

    @PostMapping("/list")
    public Flux<OfferDto> createOffers(
            @RequestHeader Integer shopId,
            @RequestBody List<CreateOfferDto> createOfferList) {
        return offerService.createOffers(createOfferList, shopId);
    }

    @PatchMapping
    public Mono<OfferDto> updateOffer(@RequestBody UpdateOfferDto updateOfferDto) {
        return offerService.updateOffer(updateOfferDto);
    }

    @DeleteMapping
    public Mono<OfferDto> deleteOffer(@RequestBody DeleteOfferDto deleteOfferDto) {
        return offerService.deleteOffer(deleteOfferDto);
    }

    @GetMapping("/product")
    public Flux<OfferDto> getOffersByProduct(@RequestBody OfferDto offerDto) {
        return offerService.getOffersByProduct(offerDto);
    }
}
