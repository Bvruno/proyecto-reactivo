package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.repository.enums.StateUser;
import com.brunovarillas.proyectoreactivo.repository.enums.UserRole;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@Table("users")
public class UserEntity {
    @Id
    private Integer id;

    private String name;
    private String email;
    private String password;
    private UserRole role;
    private StateUser status;
}
