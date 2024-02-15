package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public Mono<ProductDto> getProduct(@RequestHeader Integer productId) {
        return productService.getProduct(productId);
    }

    @GetMapping("/all")
    public Flux<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Mono<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    @PutMapping
    public Mono<ProductDto> updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

    @DeleteMapping
    public Mono<ProductDto> deleteProduct(@RequestBody Integer productId) {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/shop")
    public Flux<ProductDto> getProductsByShop(@RequestBody ProductDto productDto) {
        return productService.getProductsByShop(productDto);
    }

    @GetMapping("/price")
    public Flux<ProductDto> getProductsByPrice(@RequestBody ProductDto productDto) {
        return productService.getProductsByPrice(productDto);
    }

    @GetMapping("/stock")
    public Flux<ProductDto> getProductsByStock(@RequestBody ProductDto productDto) {
        return productService.getProductsByStock(productDto);
    }

    @GetMapping("/date")
    public Flux<ProductDto> getProductsByDate(@RequestBody ProductDto productDto) {
        return productService.getProductsByDate(productDto);
    }
}
