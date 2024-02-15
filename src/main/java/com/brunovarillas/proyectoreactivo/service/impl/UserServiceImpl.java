package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.user.CreateUserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserOrdersDto;
import com.brunovarillas.proyectoreactivo.repository.UserRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import com.brunovarillas.proyectoreactivo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public Mono<UserEntity> createUser(CreateUserDto createUserDto) {
        return userRepository.save(UserEntity.builder()
                .name(createUserDto.getName())
                .email(createUserDto.getEmail())
                .build());
    }

    @Override
    public Mono<UserEntity> updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public Mono<UserEntity> deleteUser(UserDto userDto) {
        return null;
    }

    @Override
    public Mono<UserEntity> getUser(UserDto userDto) {
        return null;
    }

    @Override
    public Flux<UserEntity> getAllUsers() {
        return null;
    }

    @Override
    public Mono<UserEntity> getUserOrders(UserOrdersDto userOrdersDto) {
        return null;
    }
}
