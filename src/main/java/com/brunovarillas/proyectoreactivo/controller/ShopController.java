package com.brunovarillas.proyectoreactivo.controller;

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

    @GetMapping
    public Mono<ShopDto> getShop(@RequestHeader ShopDto shopId) {
        return shopService.getShop(shopId);
    }

    @GetMapping("/all")
    public Flux<ShopDto> getAllShops() {
        return shopService.getAllShops();
    }

    @PostMapping
    public Mono<CreateShopDto> createShop(@RequestBody CreateShopDto createShopDto) {
        return shopService.createShop(createShopDto);
    }

    @PutMapping
    public Mono<ShopDto> updateShop(@RequestBody ShopDto shopDto) {
        return shopService.updateShop(shopDto);
    }

    @DeleteMapping
    public Mono<ShopDto> deleteShop(@RequestBody ShopDto shopDto) {
        return shopService.deleteShop(shopDto);
    }

    @GetMapping("/order")
    public Flux<ShopOrdersDto> getShopOrders(ShopOrdersDto ShopOrdersDto) {
        return shopService.getShopOrders(ShopOrdersDto);
    }
}
