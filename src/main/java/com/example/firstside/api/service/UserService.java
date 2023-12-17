package com.example.firstside.api.service;


import com.example.firstside.common.util.exception.duplicateEmailException;
import com.example.firstside.domain.user.User;
import com.example.firstside.domain.user.dto.UserDTO;
import com.example.firstside.api.repository.UserRepository;
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
    public UserDTO signUpUser(User user) throws Exception {
        validateDuplicateEmail(user.getEmail());
        User saveUser = userRepository.save(user);
        return UserDTO.createUserDto(saveUser);
    }

    private void validateDuplicateEmail(String email) throws Exception{
        if(userRepository.existsByEmail(email)){
            throw new duplicateEmailException();
        }
    }



}
