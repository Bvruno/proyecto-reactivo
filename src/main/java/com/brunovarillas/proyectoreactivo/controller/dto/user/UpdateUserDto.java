package com.brunovarillas.proyectoreactivo.controller.dto.user;

import com.brunovarillas.proyectoreactivo.repository.enums.StateUser;
import lombok.*;

public record UpdateUserDto(String password, String role, StateUser status) {
}
