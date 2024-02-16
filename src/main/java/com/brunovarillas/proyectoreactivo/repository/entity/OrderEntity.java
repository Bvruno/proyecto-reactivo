package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Getter
@Setter
@Builder
@Table("orders")
public class OrderEntity {
    private Integer id;

    @Column("offer_id")
    private Integer offerId;
    private Integer quantity;
    private Double total;
    private Long date;

    @Transient
    private OfferEntity offer;

    public static OrderEntity from(OrderDto orderDto, Integer offerId) {
        return OrderEntity.builder()
                .offerId(offerId)
                .quantity(orderDto.quantity())
                .build();
    }

    public static OrderEntity from(OrderDto orderDto, OfferEntity offerEntity) {
        return OrderEntity.builder()
                .offerId(offerEntity.getId())
                .quantity(orderDto.quantity())
                .total(offerEntity.getPrice() * orderDto.quantity())
                .date(new Date().getTime())
                .build();
    }

    public OrderDto toDto() {
        return new OrderDto(offerId, quantity, total, date);
    }
}
