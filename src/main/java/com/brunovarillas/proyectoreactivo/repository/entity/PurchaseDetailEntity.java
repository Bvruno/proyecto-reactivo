package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Getter
@Setter
@Builder
@Table("purchase_details")
public class PurchaseDetailEntity {
    @Id
    private Integer id;
    @Transient
    private ShopEntity shopId;
    @Transient
    private List<OrderEntity> listOrderId;
    private Integer quantity;
    private Double price;
    private Double total;
    private StateSale status;
    private Long date;
}
