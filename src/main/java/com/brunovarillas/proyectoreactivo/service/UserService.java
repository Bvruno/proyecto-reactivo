package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.user.CreateUserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserOrdersDto;
import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserEntity> createUser(CreateUserDto createUserDto);
    Mono<UserEntity> updateUser(UserDto userDto);
    Mono<UserEntity> deleteUser(UserDto userDto);
    Mono<UserEntity> getUser(Integer id);
    Flux<UserEntity> getAllUsers();
    Mono<UserEntity> getUserOrders(UserOrdersDto userOrdersDto);
}
