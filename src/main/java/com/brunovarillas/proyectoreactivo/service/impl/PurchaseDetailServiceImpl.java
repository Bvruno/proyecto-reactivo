package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.PurchaseDetailRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.PurchaseDetailEntity;
import com.brunovarillas.proyectoreactivo.service.PurchaseDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PurchaseDetailServiceImpl implements PurchaseDetailService {
    private final PurchaseDetailRepository purchaseDetailRepository;
    @Override
    public Mono<PurchaseDetailDto> createPurchaseDetail(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailDto> updatePurchaseDetail(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailDto> deletePurchaseDetail(Integer purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailDto> getPurchaseDetail(Integer purchaseDetailDto) {
        return null;
    }

    @Override
    public Flux<PurchaseDetailDto> getAllPurchaseDetails() {
        return null;
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByProduct(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByShop(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByUser(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByDate(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByStatus(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByShippingDate(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }
}
