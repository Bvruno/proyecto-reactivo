package com.brunovarillas.proyectoreactivo.controller.dto.shop;

import lombok.Getter;
import lombok.Setter;

public record ShopOrdersDto(String shopId, Integer userId, Integer productId, Integer quantity, String status, String date) {
}
