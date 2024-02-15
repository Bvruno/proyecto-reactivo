package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.repository.enums.StateUser;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@Table("user")
public class UserEntity {
    @Id
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String role;
    private StateUser status;
}
