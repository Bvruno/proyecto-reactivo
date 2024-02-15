package com.brunovarillas.proyectoreactivo.controller.dto.user;

import com.brunovarillas.proyectoreactivo.repository.enums.StateUser;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserDto {
    private String password;
    private String role;
    private StateUser status;
}
