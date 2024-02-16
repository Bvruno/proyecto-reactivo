package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.user.CreateUserDto;
import com.brunovarillas.proyectoreactivo.controller.dto.user.UserDto;
import com.brunovarillas.proyectoreactivo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public Mono<UserDto> getUser(@RequestParam Integer userId) {
        return userService.getUser(userId);
    }

    @GetMapping
    public Flux<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public Mono<UserDto> createUser(@RequestBody CreateUserDto createUserDto) {
        return userService.createUser(createUserDto);
    }

    @PatchMapping
    public Mono<UserDto> updateUser(@RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @DeleteMapping
    public Mono<UserDto> deleteUser(@RequestBody UserDto userDto) {
        return userService.deleteUser(userDto);
    }
}
