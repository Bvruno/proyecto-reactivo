package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.repository.ProductRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import com.brunovarillas.proyectoreactivo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Mono<ProductEntity> createProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductEntity> updateProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductEntity> deleteProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductEntity> getProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductEntity> getAllProducts() {
        return null;
    }

    @Override
    public Mono<ProductEntity> getProductsByPrice(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductEntity> getProductsByStock(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductEntity> getProductsByDate(ProductDto productDto) {
        return null;
    }

    @Override
    public Mono<ProductEntity> getProductsByShop(ProductDto productDto) {
        return null;
    }
}
