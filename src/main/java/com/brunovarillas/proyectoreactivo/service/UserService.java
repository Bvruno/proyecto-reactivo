package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.user.CreateUserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserOrdersDto;
import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserDto> createUser(CreateUserDto createUserDto);
    Mono<UserDto> updateUser(UserDto userDto);
    Mono<UserDto> deleteUser(UserDto userDto);
    Mono<UserDto> getUser(Integer id);
    Flux<UserDto> getAllUsers();
    Mono<UserDto> getUserOrders(UserOrdersDto userOrdersDto);
}
