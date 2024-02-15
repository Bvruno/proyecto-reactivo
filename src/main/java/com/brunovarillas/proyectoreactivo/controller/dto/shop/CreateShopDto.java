package com.brunovarillas.proyectoreactivo.controller.dto.shop;

import lombok.Getter;
import lombok.Setter;

public record CreateShopDto(String name, String description, String address, String schedule) {
}
