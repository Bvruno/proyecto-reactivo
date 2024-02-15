package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.repository.ProductRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import com.brunovarillas.proyectoreactivo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Mono<ProductDto> createProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductDto> updateProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductDto> deleteProduct(Integer productId) {
        return null;
    }

    @Override
    public Mono<ProductDto> getProduct(Integer productId) {
        return null;
    }

    @Override
    public Flux<ProductDto> getAllProducts() {
        return null;
    }

    @Override
    public Flux<ProductDto> getProductsByPrice(ProductDto productDto) {
        return null;
    }

    @Override
    public Flux<ProductDto> getProductsByStock(ProductDto productDto) {
        return null;
    }

    @Override
    public Flux<ProductDto> getProductsByDate(ProductDto productDto) {
        return null;
    }

    @Override
    public Flux<ProductDto> getProductsByShop(ProductDto productDto) {
        return null;
    }
}
