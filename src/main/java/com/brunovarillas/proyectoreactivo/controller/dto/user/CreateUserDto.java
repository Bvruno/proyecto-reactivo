package com.brunovarillas.proyectoreactivo.controller.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDto {
    private String name;
    private String email;
    private String password;
}
