package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.CreateShopDto;
import com.brunovarillas.proyectoreactivo.controller.dto.shop.ShopDto;
import com.brunovarillas.proyectoreactivo.repository.ProductRepository;
import com.brunovarillas.proyectoreactivo.repository.PurchaseDetailRepository;
import com.brunovarillas.proyectoreactivo.repository.ShopRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateShop;
import com.brunovarillas.proyectoreactivo.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShopRepository shopRepository;
    private final PurchaseDetailRepository purchaseDetailRepository;
    private final ProductRepository productRepository;
    @Override
    public Mono<CreateShopDto> createShop(CreateShopDto createShopDto) {
        return shopRepository.save(ShopEntity.builder()
                .name(createShopDto.name())
                .description(createShopDto.description())
                .address(createShopDto.address())
                .schedule(createShopDto.schedule())
                .status(StateShop.ACTIVE)
                .build())
                .map(shopEntity -> new CreateShopDto(
                        shopEntity.getName(),
                        shopEntity.getDescription(),
                        shopEntity.getAddress(),
                        shopEntity.getSchedule()
                ));
    }

    @Override
    public Mono<ShopDto> updateShop(ShopDto shopDto) {
        return shopRepository.findById(shopDto.id())
                .map(shopEntity -> {
                    shopEntity.setName(shopDto.name());
                    shopEntity.setAddress(shopDto.address());
                    return shopEntity;
                })
                .flatMap(shopRepository::save)
                .map(shopEntity -> new ShopDto(
                        shopEntity.getShopId(),
                        shopEntity.getDescription(),
                        shopEntity.getName(),
                        shopEntity.getAddress(),
                        shopEntity.getSchedule()
                ));
    }

    @Override
    public Mono<ShopDto> deleteShop(Integer shopId) {
        return shopRepository.findById(shopId)
                .map(shopEntity -> {
                    shopEntity.setStatus(StateShop.DELETED);
                    return shopEntity;
                })
                .flatMap(shopRepository::save)
                .map(shopEntity -> new ShopDto(
                        shopEntity.getShopId(),
                        shopEntity.getDescription(),
                        shopEntity.getName(),
                        shopEntity.getAddress(),
                        shopEntity.getSchedule()
                ));
    }

    @Override
    public Mono<ShopDto> getShop(Integer shopId) {
        return shopRepository.findById(shopId)
                .map(shopEntity -> new ShopDto(
                        shopEntity.getShopId(),
                        shopEntity.getDescription(),
                        shopEntity.getName(),
                        shopEntity.getAddress(),
                        shopEntity.getSchedule()
                ));
    }

    @Override
    public Flux<ShopDto> getAllShops() {
        return shopRepository.findAll()
                .map(shopEntity -> new ShopDto(
                        shopEntity.getShopId(),
                        shopEntity.getDescription(),
                        shopEntity.getName(),
                        shopEntity.getAddress(),
                        shopEntity.getSchedule()
                ));
    }

    @Override
    public Flux<ProductDto> getShopProducts(Integer shopId) {
        return productRepository.findAllByShopId(shopId)
                .map(ProductEntity::toDto);
    }
}
