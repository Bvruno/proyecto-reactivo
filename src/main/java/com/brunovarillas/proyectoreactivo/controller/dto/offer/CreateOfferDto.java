package com.brunovarillas.proyectoreactivo.controller.dto.offer;

public record CreateOfferDto(
        Integer productId,
        Integer stock,
        Double price
) {
}
