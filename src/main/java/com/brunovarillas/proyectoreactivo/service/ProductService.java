package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<ProductDto> createProduct(ProductDto productDto);
    Mono<ProductDto> updateProduct(ProductDto productDto);
    Mono<ProductDto> deleteProduct(ProductDto productDto);
    Mono<ProductDto> getProduct(ProductDto productDto);
    Flux<ProductDto> getAllProducts();
    Flux<ProductDto> getProductsByPrice(ProductDto productDto);
    Flux<ProductDto> getProductsByStock(ProductDto productDto);
    Flux<ProductDto> getProductsByDate(ProductDto productDto);
    Flux<ProductDto> getProductsByShop(ProductDto productDto);
}
