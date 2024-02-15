package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.shop.CreateShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopOrdersDto;
import com.brunovarillas.proyectoreactivo.repository.ShopRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import com.brunovarillas.proyectoreactivo.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShopRepository shopRepository;
    @Override
    public Mono<CreateShopDto> createShop(CreateShopDto createShopDto) {
        return null;
    }

    @Override
    public Mono<ShopDto> updateShop(ShopDto shopDto) {
        return null;
    }

    @Override
    public Mono<ShopDto> deleteShop(ShopDto shopDto) {
        return null;
    }

    @Override
    public Mono<ShopDto> getShop(ShopDto shopDto) {
        return null;
    }

    @Override
    public Flux<ShopDto> getAllShops() {
        return null;
    }

    @Override
    public Mono<ShopOrdersDto> getShopOrders(ShopOrdersDto ShopOrdersDto) {
        return null;
    }
}
