package br.com.fiap.challenge_app_parquimetro.controller;

import br.com.fiap.challenge_app_parquimetro.data.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.fiap.challenge_app_parquimetro.controller.UserController.PATH_ROOT;

@RequiredArgsConstructor
@RestController
@RequestMapping(PATH_ROOT)
public class UserController {

    public static final String PATH_ROOT = "/user";

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {

        return ResponseEntity.ok(userDto);
    }








}

