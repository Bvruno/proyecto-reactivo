package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ProductService {
    Mono<ProductDto> createProduct(ProductDto productDto, Integer shopId);
    Flux<ProductDto> createProducts(List<ProductDto> productDtoFlux, Integer shopId);
    Mono<ProductDto> updateProduct(ProductDto productDto);
    Mono<ProductDto> deleteProduct(Integer productId);
    Mono<ProductDto> getProduct(Integer productId);
    Flux<ProductDto> getAllProducts();
    Flux<ProductDto> getProductsByShop(Integer shopId);
}
