package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.CreatePurcharseDetailDto;
import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Builder
@Table("purchase_details")
public class PurchaseDetailEntity {
    @Id
    @Column("purchase_details_id")
    private Integer purchaseDetailsId;

    @Column("list_order_id")
    private List<Integer> listOrderId;

    private Integer quantity;
    private Double price;

    private StateSale status;

    private Long date;

    public static PurchaseDetailEntity from(PurchaseDetailDto purchaseDetailDto) {
        return PurchaseDetailEntity.builder()
                .listOrderId(purchaseDetailDto.listOrderId())
                .quantity(purchaseDetailDto.quantity())
                .price(purchaseDetailDto.price())
                .status(purchaseDetailDto.status())
                .date(purchaseDetailDto.date())
                .build();
    }

    public static PurchaseDetailEntity from(CreatePurcharseDetailDto createPurcharseDetailDto, List<OrderEntity> listOrderEntity, Integer userId) {
        return PurchaseDetailEntity.builder()
                .listOrderId(createPurcharseDetailDto.listOrderId())
                .quantity(listOrderEntity.stream().mapToInt(OrderEntity::getQuantity).sum())
                .price(listOrderEntity.stream().mapToDouble(OrderEntity::getTotal).sum())
                .status(StateSale.PAID)
                .date(new Date().getTime())
                .build();
    }

    public PurchaseDetailDto toDto() {
        return new PurchaseDetailDto(listOrderId, quantity, price, status, date);
    }

    public PurchaseDetailEntity update(PurchaseDetailDto purchaseDetailDto, Integer purchaseDetailId) {
        return PurchaseDetailEntity.builder()
                .purchaseDetailsId(purchaseDetailId)
                .listOrderId(purchaseDetailDto.listOrderId())
                .quantity(purchaseDetailDto.quantity())
                .price(purchaseDetailDto.price())
                .status(purchaseDetailDto.status())
                .date(purchaseDetailDto.date())
                .build();
    }
}
