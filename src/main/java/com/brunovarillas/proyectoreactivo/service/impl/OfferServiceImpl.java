package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.CreateOfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.DeleteOfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.UpdateOfferDto;
import com.brunovarillas.proyectoreactivo.repository.OfferRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateOffer;
import com.brunovarillas.proyectoreactivo.service.OfferService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {
    private final OfferRepository offerRepository;
    @Override
    public Mono<OfferDto> createOffer(
            CreateOfferDto offerDto,
            Integer shopId) {
        return offerRepository.save(OfferEntity.from(offerDto, shopId)).map(OfferEntity::toDto);
    }

    @Override
    public Flux<OfferDto> createOffers(
            List<CreateOfferDto> createOfferList,
            Integer shopId) {
        return offerRepository.saveAll(
                createOfferList.stream()
                        .map(offerDto -> OfferEntity.from(offerDto, shopId)).toList())
                .map(OfferEntity::toDto);
    }

    @Override
    public Mono<OfferDto> updateOffer(UpdateOfferDto updateOfferDto) {
        return offerRepository.findById(updateOfferDto.offerId())
                .flatMap(offerEntity -> offerRepository.save(offerEntity.update(updateOfferDto)).thenReturn(offerEntity))
                .map(OfferEntity::toDto);
    }

    @Override
    public Mono<OfferDto> deleteOffer(DeleteOfferDto deleteOfferDto) {
        return offerRepository.findById(deleteOfferDto.offerId())
                .flatMap(offerEntity -> {
                    offerEntity.setStatus(StateOffer.INACTIVE);
                    return offerRepository.save(offerEntity).thenReturn(offerEntity);
                })
                .map(OfferEntity::toDto);
    }

    @Override
    public Mono<OfferDto> getOffer(Integer offerId) {
        return offerRepository.findById(offerId).map(OfferEntity::toDto);
    }

    @Override
    public Flux<OfferDto> getAllOffers() {
        return offerRepository.findAll().map(OfferEntity::toDto);
    }

    @Override
    public Flux<OfferDto> getOffersByProduct(OfferDto offerDto) {
        return offerRepository.findByProductId(offerDto.productId()).map(OfferEntity::toDto);
    }
}
