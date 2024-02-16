package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{productId}")
    public Mono<ProductDto> getProduct(@RequestParam Integer productId) {
        return productService.getProduct(productId);
    }

    @GetMapping
    public Flux<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Mono<ProductDto> createProduct(@RequestHeader Integer shopId, @RequestBody ProductDto productDto) {
        return productService.createProduct(productDto, shopId);
    }

    @PostMapping("/list")
    public Flux<ProductDto> createProducts(@RequestHeader Integer shopId, @RequestBody List<ProductDto> listProductDtos) {
        return productService.createProducts(listProductDtos, shopId);
    }

    @PatchMapping
    public Mono<ProductDto> updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

    @DeleteMapping
    public Mono<ProductDto> deleteProduct(@RequestBody Integer productId) {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/{shopId}")
    public Flux<ProductDto> getProductsByShop(@RequestParam Integer shopId) {
        return productService.getProductsByShop(shopId);
    }


}
