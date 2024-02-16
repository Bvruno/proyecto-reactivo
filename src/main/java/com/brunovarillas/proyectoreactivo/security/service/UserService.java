package com.brunovarillas.proyectoreactivo.security.service;

import com.brunovarillas.proyectoreactivo.exception.CustomException;
import com.brunovarillas.proyectoreactivo.repository.UserRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.Role;
import com.brunovarillas.proyectoreactivo.security.dto.CreateUserDto;
import com.brunovarillas.proyectoreactivo.security.dto.LoginDto;
import com.brunovarillas.proyectoreactivo.security.dto.TokenDto;
import com.brunovarillas.proyectoreactivo.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final JwtProvider jwtProvider;

    private final PasswordEncoder passwordEncoder;

    public Mono<TokenDto> login(LoginDto dto) {
        return userRepository.findByUsernameOrEmail(dto.getUsername(), dto.getUsername())
                .filter(user -> passwordEncoder.matches(dto.getPassword(), user.getPassword()))
                .map(user -> new TokenDto(jwtProvider.generateToken(user)))
                .switchIfEmpty(Mono.error(new CustomException(HttpStatus.BAD_REQUEST, "bad credentials")));
    }

    public Mono<UserEntity> create(CreateUserDto dto) {
        UserEntity user = UserEntity.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .role(Role.ROLE_USER)
                .build();
        Mono<Boolean> userExists = userRepository.findByUsernameOrEmail(user.getUsername(), user.getEmail()).hasElement();
        return userExists
                .flatMap(exists -> exists ?
                        Mono.error(new CustomException(HttpStatus.BAD_REQUEST, "username or email already in use"))
                        : userRepository.save(user));
    }
}
