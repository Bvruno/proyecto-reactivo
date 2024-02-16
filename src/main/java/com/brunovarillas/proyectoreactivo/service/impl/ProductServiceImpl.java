package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.repository.ProductRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import com.brunovarillas.proyectoreactivo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Mono<ProductDto> createProduct(ProductDto productDto, Integer shopId) {
        return productRepository.save(ProductEntity.from(productDto, shopId)).map(ProductEntity::toDto);
    }

    @Override
    public Flux<ProductDto> createProducts(List<ProductDto> productDtoFlux, Integer shopId) {
        return productRepository.saveAll(productDtoFlux.stream().map(productDto -> ProductEntity.from(productDto, shopId)).toList()).map(ProductEntity::toDto);
    }

    @Override
    public Mono<ProductDto> updateProduct(ProductDto productDto) {
        return productRepository.findById(productDto.id())
                .flatMap(productEntity -> productRepository.save(productEntity.update(productDto)).thenReturn(productEntity))
                .map(ProductEntity::toDto);
    }

    @Override
    public Mono<ProductDto> deleteProduct(Integer productId) {
        return productRepository.findById(productId)
                .flatMap(productEntity -> productRepository.delete(productEntity).thenReturn(productEntity))
                .map(ProductEntity::toDto);
    }

    @Override
    public Mono<ProductDto> getProduct(Integer productId) {
        return productRepository.findById(productId).map(ProductEntity::toDto);
    }

    @Override
    public Flux<ProductDto> getAllProducts() {
        return productRepository.findAll().map(ProductEntity::toDto);
    }


    @Override
    public Flux<ProductDto> getProductsByShop(Integer shopId) {
        return productRepository.findAllByShopId(shopId).map(ProductEntity::toDto);
    }
}
