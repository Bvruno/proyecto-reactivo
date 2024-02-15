package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.shop.CreateShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopOrdersDto;
import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import reactor.core.publisher.Mono;

public interface ShopService {
    Mono<ShopEntity> createShop(CreateShopDto createShopDto);
    Mono<ShopEntity> updateShop(ShopDto shopDto);
    Mono<ShopEntity> deleteShop(ShopDto shopDto);
    Mono<ShopEntity> getShop(ShopDto shopDto);
    Mono<ShopEntity> getAllShops();
    Mono<ShopEntity> getShopOrders(ShopOrdersDto ShopOrdersDto);
}
