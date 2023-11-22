package com.example.firstside.service;


import com.example.firstside.dto.UserDTO;
import com.example.firstside.exception.UserException;
import com.example.firstside.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void signUpUser(UserDTO userDto)throws Exception{
        log.info("param = {}",userDto);
        validateDuplicateEmail(userDto.getEmail());
        userRepository.save(UserDTO.createUser(userDto));
    }

    private void validateDuplicateEmail(String email) throws Exception{
        if(userRepository.existsByEmail(email)){
            throw new UserException();
        }
    }



}
