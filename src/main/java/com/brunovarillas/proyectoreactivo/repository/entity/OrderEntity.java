package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.order.CreateOrderDto;
import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Getter
@Setter
@Builder
@Table("orders")
public class OrderEntity {
    @Id
    @Column("order_id")
    private Integer orderId;

    @Column("offer_id")
    private Integer offerId;
    private Integer quantity;
    private Double total;
    private Long date;

    public static OrderEntity from(OrderDto orderDto, Integer offerId) {
        return OrderEntity.builder()
                .offerId(offerId)
                .quantity(orderDto.quantity())
                .build();
    }

    public static OrderEntity from(OrderDto orderDto, OfferEntity offerEntity) {
        return OrderEntity.builder()
                .offerId(offerEntity.getOfferId())
                .quantity(orderDto.quantity())
                .total(offerEntity.getPrice() * orderDto.quantity())
                .date(new Date().getTime())
                .build();
    }

    public static OrderEntity from(CreateOrderDto orderDto, OfferEntity offerEntity) {
        return OrderEntity.builder()
                .offerId(offerEntity.getOfferId())
                .quantity(orderDto.quantity())
                .total(offerEntity.getPrice() * orderDto.quantity())
                .date(new Date().getTime())
                .build();
    }

    public OrderDto toDto() {
        return new OrderDto(offerId, quantity, total, date);
    }

    public OrderEntity update(OrderDto orderDto) {
        return OrderEntity.builder()
                .offerId(orderDto.offerId())
                .quantity(orderDto.quantity())
                .total(orderDto.total())
                .date(orderDto.date())
                .build();
    }
}
