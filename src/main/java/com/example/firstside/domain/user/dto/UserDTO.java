package com.example.firstside.domain.user.dto;

import com.example.firstside.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class UserDTO {


    private String email;

    private String name;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;

    private String password;

    private String grade;

    @Builder
    private UserDTO(String email, String name, LocalDateTime createBy, LocalDateTime updateBy, String password, String grade) {
        this.email = email;
        this.name = name;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.password = password;
        this.grade = grade;
    }

    public static UserDTO createUserDto(User user){
        return UserDTO.builder()
                .createBy(LocalDateTime.now())
                .updateBy(LocalDateTime.now())
                .name(user.getName())
                .password(user.getPassword())
                .email(user.getEmail())
                .build();
    }





}
