package com.brunovarillas.proyectoreactivo.controller.dto.order;

public record OrderDto(
    Integer offerId,
    Integer quantity,
    Double total,
    Long date
) {
}
