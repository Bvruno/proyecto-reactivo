package com.brunovarillas.proyectoreactivo.controller.dto.offer;

import com.brunovarillas.proyectoreactivo.repository.entity.ProductEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateOffer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
public class OfferDto {

    private Integer productId;

    private Integer stock;
    private Double price;
    private StateOffer status;
    private Long date;
}
