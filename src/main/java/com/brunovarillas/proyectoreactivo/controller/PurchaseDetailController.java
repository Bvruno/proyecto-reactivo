package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import com.brunovarillas.proyectoreactivo.service.PurchaseDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/purchase-detail")
@RequiredArgsConstructor
public class PurchaseDetailController {
    private final PurchaseDetailService purchaseDetailService;

    @GetMapping
    public Mono<PurchaseDetailDto> getPurchaseDetail(@RequestHeader Integer purchaseDetailId) {
        return purchaseDetailService.getPurchaseDetail(purchaseDetailId);
    }

    @GetMapping("/all")
    public Flux<PurchaseDetailDto> getAllPurchaseDetails() {
        return purchaseDetailService.getAllPurchaseDetails();
    }

    @PostMapping
    public Mono<PurchaseDetailDto> createPurchaseDetail(
            @RequestBody PurchaseDetailDto purchaseDetailDto
    ) {
        return purchaseDetailService.createPurchaseDetail(purchaseDetailDto);
    }

    @PatchMapping("/{purchaseDetailId}")
    public Mono<PurchaseDetailDto> updatePurchaseDetail(
            @RequestBody PurchaseDetailDto purchaseDetailDto,
            @RequestParam Integer purchaseDetailId
    ) {
        return purchaseDetailService.updatePurchaseDetail(purchaseDetailDto, purchaseDetailId);
    }

    @DeleteMapping
    public Mono<PurchaseDetailDto> deletePurchaseDetail(@RequestBody Integer purchaseDetailId) {
        return purchaseDetailService.deletePurchaseDetail(purchaseDetailId);
    }

    @GetMapping("/shop/{shopId}")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByShop(@RequestParam Integer shopId) {
        return purchaseDetailService.getPurchaseDetailsByShop(shopId);
    }

    @GetMapping("/user/{userId}")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByUser(@RequestParam Integer userId) {
        return purchaseDetailService.getPurchaseDetailsByUser(userId);
    }

    @GetMapping("/date/{date}")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByDate(@RequestParam Long date) {
        return purchaseDetailService.getPurchaseDetailsByDate(date);
    }

    @GetMapping("/status/{stateSale}")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByStatus(@RequestParam StateSale stateSale) {
        return purchaseDetailService.getPurchaseDetailsByStatus(stateSale);
    }

}
