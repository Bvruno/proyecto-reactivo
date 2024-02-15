package com.brunovarillas.proyectoreactivo.controller.dto.product;

import com.brunovarillas.proyectoreactivo.repository.entity.ShopEntity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProductDto {
    private String name;
    private String description;
    private String urlImage;

    private Integer shopId;
}
