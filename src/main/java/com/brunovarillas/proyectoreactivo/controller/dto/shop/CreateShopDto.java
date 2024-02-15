package com.brunovarillas.proyectoreactivo.controller.dto.shop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateShopDto {
    private String name;
    private String description;
    private String address;
    private String schedule;
}
