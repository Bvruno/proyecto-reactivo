package com.brunovarillas.proyectoreactivo.controller.dto.product;

import com.brunovarillas.proyectoreactivo.repository.enums.StateProduct;

public record ProductDto(
        Integer id,
        String name,
        String description,
        String urlImage,
        Integer shopId,
        StateProduct state
) {
}
