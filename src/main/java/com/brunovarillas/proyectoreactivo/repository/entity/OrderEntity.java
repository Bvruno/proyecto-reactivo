package com.brunovarillas.proyectoreactivo.repository.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@Table("orders")
public class OrderEntity {
    private Integer id;

    @Transient
    @Column("user_id")
    private UserEntity userId;

    @Transient
    @Column("offer_id")
    private OfferEntity offerId;
    private Integer quantity;
    private Double total;
    private Long date;
}
