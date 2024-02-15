package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.PurchaseDetailRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.PurchaseDetailEntity;
import com.brunovarillas.proyectoreactivo.service.PurchaseDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PurchaseDetailServiceImpl implements PurchaseDetailService {
    private final PurchaseDetailRepository purchaseDetailRepository;
    @Override
    public Mono<PurchaseDetailEntity> createPurchaseDetail(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> updatePurchaseDetail(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> deletePurchaseDetail(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getPurchaseDetail(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getAllPurchaseDetails() {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getPurchaseDetailsByProduct(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getPurchaseDetailsByShop(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getPurchaseDetailsByUser(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getPurchaseDetailsByDate(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getPurchaseDetailsByStatus(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }

    @Override
    public Mono<PurchaseDetailEntity> getPurchaseDetailsByShippingDate(PurchaseDetailDto purchaseDetailDto) {
        return null;
    }
}
