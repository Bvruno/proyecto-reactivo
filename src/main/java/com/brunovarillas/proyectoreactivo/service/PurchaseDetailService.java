package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.CreatePurcharseDetailDto;
import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PurchaseDetailService {
    Mono<PurchaseDetailDto> createPurchaseDetail(CreatePurcharseDetailDto createPurcharseDetailDto, Integer userId);
    Mono<PurchaseDetailDto> updatePurchaseDetail(PurchaseDetailDto purchaseDetailDto, Integer purchaseDetailId);
    Mono<PurchaseDetailDto> deletePurchaseDetail(Integer purchaseDetailDto);
    Mono<PurchaseDetailDto> getPurchaseDetail(Integer purchaseDetailDto);
    Flux<PurchaseDetailDto> getAllPurchaseDetails();
    Flux<PurchaseDetailDto> getPurchaseDetailsByDate(Long date);
    Flux<PurchaseDetailDto> getPurchaseDetailsByStatus(StateSale status);
}
