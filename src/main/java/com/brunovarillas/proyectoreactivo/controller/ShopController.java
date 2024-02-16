package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.CreateShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopOrdersDto;
import com.brunovarillas.proyectoreactivo.service.ShopService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/shop")
@Slf4j
@RequiredArgsConstructor
public class ShopController {
    private final ShopService shopService;

    @GetMapping("/{shopId}")
    public Mono<ShopDto> getShop(@RequestParam Integer shopId) {
        return shopService.getShop(shopId);
    }

    @GetMapping
    public Flux<ShopDto> getAllShops() {
        return shopService.getAllShops();
    }

    @PostMapping
    public Mono<CreateShopDto> createShop(@RequestBody CreateShopDto createShopDto) {
        return shopService.createShop(createShopDto);
    }

    @PatchMapping
    public Mono<ShopDto> updateShop(@RequestBody ShopDto shopDto) {
        return shopService.updateShop(shopDto);
    }

    @DeleteMapping
    public Mono<ShopDto> deleteShop(@RequestHeader Integer shopId) {
        return shopService.deleteShop(shopId);
    }

    @GetMapping("/order")
    public Flux<PurchaseDetailDto> getShopPurchaseDetails(@RequestHeader Integer shopId) {
        return shopService.getShopPurchaseDetails(shopId);
    }

    @GetMapping("/products")
    public Flux<ProductDto> getShopProducts(@RequestHeader Integer shopId) {
        return shopService.getShopProducts(shopId);
    }
}
