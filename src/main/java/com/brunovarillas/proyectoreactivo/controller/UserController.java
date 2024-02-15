package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.user.UserDto;
import com.brunovarillas.proyectoreactivo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping()
    public Mono<UserDto> getUser(@RequestHeader Integer userId) {
        return userService.getUser(userId)
                .cast(UserDto.class);
    }

    @GetMapping("/all")
    public Mono<Flux<UserDto>> getAllUsers() {
        return userService.getAllUsers()
                .flatMap(Flux::from)
    }
}
