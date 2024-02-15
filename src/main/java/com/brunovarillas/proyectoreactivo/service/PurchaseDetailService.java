package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.entity.PurchaseDetailEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PurchaseDetailService {
    Mono<PurchaseDetailDto> createPurchaseDetail(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailDto> updatePurchaseDetail(PurchaseDetailDto purchaseDetailDto);
    Mono<PurchaseDetailDto> deletePurchaseDetail(Integer purchaseDetailDto);
    Mono<PurchaseDetailDto> getPurchaseDetail(Integer purchaseDetailDto);
    Flux<PurchaseDetailDto> getAllPurchaseDetails();
    Flux<PurchaseDetailDto> getPurchaseDetailsByProduct(PurchaseDetailDto purchaseDetailDto);
    Flux<PurchaseDetailDto> getPurchaseDetailsByShop(PurchaseDetailDto purchaseDetailDto);
    Flux<PurchaseDetailDto> getPurchaseDetailsByUser(PurchaseDetailDto purchaseDetailDto);
    Flux<PurchaseDetailDto> getPurchaseDetailsByDate(PurchaseDetailDto purchaseDetailDto);
    Flux<PurchaseDetailDto> getPurchaseDetailsByStatus(PurchaseDetailDto purchaseDetailDto);
    Flux<PurchaseDetailDto> getPurchaseDetailsByShippingDate(PurchaseDetailDto purchaseDetailDto);
}
