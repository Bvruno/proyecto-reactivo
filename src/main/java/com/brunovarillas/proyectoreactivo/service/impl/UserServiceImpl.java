package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.user.CreateUserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserOrdersDto;
import com.brunovarillas.proyectoreactivo.repository.UserRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateUser;
import com.brunovarillas.proyectoreactivo.repository.enums.Role;
import com.brunovarillas.proyectoreactivo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public Mono<UserDto> createUser(CreateUserDto createUserDto) {
        UserEntity user = UserEntity.builder()
                .username(createUserDto.name())
                .email(createUserDto.email())
                .password(createUserDto.password())
                .role(Role.ROLE_USER)
                .status(StateUser.ACTIVE)
                .build();
        return userRepository.save(user)
                .map(userEntity -> new UserDto(userEntity.getUserId(),userEntity.getUsername(), userEntity.getEmail()));
    }

    @Override
    public Mono<UserDto> updateUser(UserDto userDto) {
        return userRepository.findById(userDto.id())
                .map(userEntity -> {
                    userEntity.setUsername(userDto.name());
                    userEntity.setEmail(userDto.email());
                    return userEntity;
                })
                .flatMap(userRepository::save)
                .map(userEntity -> new UserDto(userEntity.getUserId(), userEntity.getUsername(), userEntity.getEmail()));
    }

    @Override
    public Mono<UserDto> deleteUser(Integer userId) {
        return userRepository.findById(userId)
                .map(userEntity -> {
                    userEntity.setStatus(StateUser.INACTIVE);
                    return userEntity;
                })
                .flatMap(userRepository::save)
                .map(userEntity -> new UserDto(userEntity.getUserId(), userEntity.getUsername(), userEntity.getEmail()));
    }

    @Override
    public Mono<UserDto> getUser(Integer id) {
        return userRepository.findById(id)
                .map(userEntity -> new UserDto(userEntity.getUserId(), userEntity.getUsername(), userEntity.getEmail()));
    }

    @Override
    public Flux<UserDto> getAllUsers() {
        return userRepository.findAll()
                .map(userEntity -> new UserDto(userEntity.getUserId(), userEntity.getUsername(), userEntity.getEmail()));
    }

    @Override
    public Mono<UserDto> getUserOrders(UserOrdersDto userOrdersDto) {
        return userRepository.findById(userOrdersDto.userId())
                .map(userEntity -> new UserDto(userEntity.getUserId(), userEntity.getUsername(), userEntity.getEmail()));
    }
}
