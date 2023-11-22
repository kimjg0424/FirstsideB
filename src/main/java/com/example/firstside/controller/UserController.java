package com.example.firstside.controller;


import com.example.firstside.dto.UserDTO;
import com.example.firstside.exception.UserException;
import com.example.firstside.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Slf4j
public class UserController {

    private final UserService userService;


    @PostMapping(value = "/singup",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void signUpUser(@RequestBody @Valid UserDTO userDTO) throws Exception{
      log.info("userDTO = {}",userDTO);
        userService.signUpUser(userDTO);
    }


}




