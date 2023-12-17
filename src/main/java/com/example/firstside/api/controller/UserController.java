package com.example.firstside.api.controller;


import com.example.firstside.domain.user.User;
import com.example.firstside.domain.user.dto.UserDTO;
import com.example.firstside.api.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Slf4j
public class UserController {

    private final UserService userService;


    @PostMapping(value = "/singup",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void signUpUser(@RequestBody @Valid User user) throws Exception {
        userService.signUpUser(user);
    }


}




