package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.shop.CreateShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopOrdersDto;
import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ShopService {
    Mono<CreateShopDto> createShop(CreateShopDto createShopDto);
    Mono<ShopDto> updateShop(ShopDto shopDto);
    Mono<ShopDto> deleteShop(Integer shopId);
    Mono<ShopDto> getShop(Integer shopId);
    Flux<ShopDto> getAllShops();
    Flux<ShopOrdersDto> getShopOrders(ShopOrdersDto ShopOrdersDto);
}
