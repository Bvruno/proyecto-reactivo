package com.brunovarillas.proyectoreactivo.security.controller;

import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import com.brunovarillas.proyectoreactivo.security.dto.CreateUserDto;
import com.brunovarillas.proyectoreactivo.security.dto.LoginDto;
import com.brunovarillas.proyectoreactivo.security.dto.TokenDto;
import com.brunovarillas.proyectoreactivo.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
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
    public Mono<ServerResponse> login(ServerRequest request) {
        Mono<LoginDto> dtoMono = request.bodyToMono(LoginDto.class);
        return dtoMono
                .flatMap(dto -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(userService.login(dto), TokenDto.class));
    }

    @PostMapping("/register")
    public Mono<ServerResponse> create(ServerRequest request) {
        Mono<CreateUserDto> dtoMono = request.bodyToMono(CreateUserDto.class);
        return dtoMono
                .flatMap(dto -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(userService.create(dto), UserEntity.class));
    }
}
