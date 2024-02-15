package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
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
    public Mono<PurchaseDetailDto> createPurchaseDetail(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.createPurchaseDetail(purchaseDetailDto);
    }

    @PutMapping
    public Mono<PurchaseDetailDto> updatePurchaseDetail(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.updatePurchaseDetail(purchaseDetailDto);
    }

    @DeleteMapping
    public Mono<PurchaseDetailDto> deletePurchaseDetail(@RequestBody Integer purchaseDetailId) {
        return purchaseDetailService.deletePurchaseDetail(purchaseDetailId);
    }

    @GetMapping("/product")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByProduct(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.getPurchaseDetailsByProduct(purchaseDetailDto);
    }

    @GetMapping("/shop")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByShop(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.getPurchaseDetailsByShop(purchaseDetailDto);
    }

    @GetMapping("/user")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByUser(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.getPurchaseDetailsByUser(purchaseDetailDto);
    }

    @GetMapping("/date")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByDate(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.getPurchaseDetailsByDate(purchaseDetailDto);
    }

    @GetMapping("/status")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByStatus(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.getPurchaseDetailsByStatus(purchaseDetailDto);
    }

    @GetMapping("/shipping-date")
    public Flux<PurchaseDetailDto> getPurchaseDetailsByShippingDate(@RequestBody PurchaseDetailDto purchaseDetailDto) {
        return purchaseDetailService.getPurchaseDetailsByShippingDate(purchaseDetailDto);
    }
}
