package com.example.firstside.dto;

import com.example.firstside.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {


    @NotBlank(message = "이메일은 필수입니다.")
    @Email
    private String email;

    @NotBlank(message = "이름은 필수입니다.")
    @Size(max = 5, min = 2,
          message = "이름은 2자리 이상 5자리 이하여야 합니다.")
    private String name;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;
    @NotBlank(message = "비밀번호는 필수 입니다.")
    @Size(max = 20, min = 5,
          message = "비밀번호는 5자리 이상  20자리 이하여야 합니다.")
    private String password;

    private String grade;

    public static User createUser(UserDTO userDTO){
        return User.builder()
                .createBy(LocalDateTime.now())
                .updateBy(LocalDateTime.now())
                .name(userDTO.name)
                .grade(userDTO.grade)
                .password(userDTO.password)
                .email(userDTO.email)
                .build();
    }


}
