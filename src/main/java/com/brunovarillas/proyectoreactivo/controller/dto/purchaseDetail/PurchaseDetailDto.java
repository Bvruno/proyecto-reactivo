package com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail;

import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;

import java.util.List;
public record PurchaseDetailDto(
        List<Integer> listOrderId,
        Integer quantity,
        Double price,
        StateSale status,
        Long date) {
}
