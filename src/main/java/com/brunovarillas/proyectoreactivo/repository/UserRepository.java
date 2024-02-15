package com.brunovarillas.proyectoreactivo.repository;

import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface UserRepository extends R2dbcRepository<UserEntity, Integer> {
}
