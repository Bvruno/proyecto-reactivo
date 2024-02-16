package com.brunovarillas.proyectoreactivo.security.controller;

import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import com.brunovarillas.proyectoreactivo.security.dto.CreateUserDto;
import com.brunovarillas.proyectoreactivo.security.dto.LoginDto;
import com.brunovarillas.proyectoreactivo.security.dto.TokenDto;
import com.brunovarillas.proyectoreactivo.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/login")
    public Mono<TokenDto> login(@RequestBody LoginDto request) {
        return userService.login(request);
    }

    @PostMapping("/register")
    public Mono<UserEntity> create(@RequestBody CreateUserDto request) {
        return userService.create(request);
    }
}
