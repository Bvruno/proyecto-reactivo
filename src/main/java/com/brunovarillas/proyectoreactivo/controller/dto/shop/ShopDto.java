package com.brunovarillas.proyectoreactivo.controller.dto.shop;

import lombok.Getter;
import lombok.Setter;

public record ShopDto(Integer id, String description, String schedule, String address, String name) {
}
