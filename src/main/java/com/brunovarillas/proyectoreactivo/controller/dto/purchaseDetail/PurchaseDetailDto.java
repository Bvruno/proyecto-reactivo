package com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail;

import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PurchaseDetailDto {
    private ShopEntity shopId;
    private List<Integer> listOrderId;
    private Integer quantity;
    private Double price;
    private Double total;
    private StateSale status;
    private Long date;
}
