package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<ProductEntity> createProduct(ProductDto productDto);
    Mono<ProductEntity> updateProduct(ProductDto productDto);
    Mono<ProductEntity> deleteProduct(ProductDto productDto);
    Mono<ProductEntity> getProduct(ProductDto productDto);
    Mono<ProductEntity> getAllProducts();
    Mono<ProductEntity> getProductsByPrice(ProductDto productDto);
    Mono<ProductEntity> getProductsByStock(ProductDto productDto);
    Mono<ProductEntity> getProductsByDate(ProductDto productDto);
    Mono<ProductEntity> getProductsByShop(ProductDto productDto);
}
