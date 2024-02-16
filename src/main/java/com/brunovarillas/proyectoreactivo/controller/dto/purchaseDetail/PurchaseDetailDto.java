package com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail;

import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;

import java.util.List;
public record PurchaseDetailDto(
        Integer shopId, List<Integer> listOrderId,
        Integer quantity, Double price, Double total,
        StateSale status, Long date) {
}
