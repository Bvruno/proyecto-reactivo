package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.entity.PurchaseDetailEntity;
import reactor.core.publisher.Mono;

public interface PurchaseDetailService {
    Mono<PurchaseDetailEntity> createPurchaseDetail(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> updatePurchaseDetail(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> deletePurchaseDetail(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> getPurchaseDetail(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> getAllPurchaseDetails();
    Mono<PurchaseDetailEntity> getPurchaseDetailsByProduct(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> getPurchaseDetailsByShop(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> getPurchaseDetailsByUser(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> getPurchaseDetailsByDate(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> getPurchaseDetailsByStatus(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailEntity> getPurchaseDetailsByShippingDate(PurchaseDetailDto purchaseDetailDto);
}
