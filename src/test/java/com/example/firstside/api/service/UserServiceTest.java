package com.example.firstside.api.service;

import com.example.firstside.domain.user.User;
import com.example.firstside.api.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@SpringBatchTest
class UserServiceTest {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @DisplayName("가입하는 유저의 이메일이 중복인지 확인을 한다")
    @Test
    void testName(){
        //given
        User user1 = createUser("김정기", "123456", "jung@naver.com", LocalDateTime.now(), LocalDateTime.now());

        //when
//        boolean b = userRepository.existsByEmail();


        //then

    }

    @DisplayName(" ")
    @Test
    void singUpUser(){
        //given

        //when

        //then
    }

    public static User createUser(String name, String password, String email, LocalDateTime createBy,
                LocalDateTime updateBy){
        return User.builder()
                .createBy(createBy)
                .updateBy(updateBy)
                .name(name)
                .password(password)
                .email(email)
                .build();
    }

}
