package com.brunovarillas.proyectoreactivo.controller.dto.shop;

import lombok.Getter;
import lombok.Setter;

public record ShopOrdersDto(
        Integer shopId,
        Integer userId,
        Integer productId,
        Integer quantity,
        String status,
        String date) {
}
