package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Getter
@Setter
@Builder
@Table("purchase_details")
public class PurchaseDetailEntity {
    @Id
    private Integer id;

    @Column("shop_id")
    private Integer shopId;

    @Column("user_id")
    private UserEntity userId;

    @Column("list_order_id")
    private List<Integer> listOrderId;

    private Integer quantity;
    private Double price;
    private Double total;
    private StateSale status;
    private Long date;

    @Transient
    private ShopEntity shop;

    public static PurchaseDetailEntity from(PurchaseDetailDto purchaseDetailDto) {
        return PurchaseDetailEntity.builder()
                .shopId(purchaseDetailDto.shopId())
                .listOrderId(purchaseDetailDto.listOrderId())
                .quantity(purchaseDetailDto.quantity())
                .price(purchaseDetailDto.price())
                .total(purchaseDetailDto.total())
                .status(purchaseDetailDto.status())
                .date(purchaseDetailDto.date())
                .build();
    }

    public PurchaseDetailDto toDto() {
        return new PurchaseDetailDto(shopId, listOrderId, quantity, price, total, status, date);
    }

    public PurchaseDetailEntity update(PurchaseDetailDto purchaseDetailDto, Integer purchaseDetailId) {
        return PurchaseDetailEntity.builder()
                .id(purchaseDetailId)
                .shopId(purchaseDetailDto.shopId())
                .listOrderId(purchaseDetailDto.listOrderId())
                .quantity(purchaseDetailDto.quantity())
                .price(purchaseDetailDto.price())
                .total(purchaseDetailDto.total())
                .status(purchaseDetailDto.status())
                .date(purchaseDetailDto.date())
                .build();
    }
}
