package com.brunovarillas.proyectoreactivo.controller.dto.order;

import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
    private Integer userId;

    private Integer offerId;
    private Integer quantity;
}
