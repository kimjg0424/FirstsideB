package com.example.firstside.domain.user;

import com.example.firstside.domain.user.dto.UserDTO;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter
@NoArgsConstructor
public class User {

    @GeneratedValue
    @Id
    private long id;

    private String name;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;


    private String password;

    private String email;

    @Builder
    private User(long id, String name, LocalDateTime createBy,
                LocalDateTime updateBy, String password, String email) {
        this.id = id;
        this.name = name;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.password = password;
        this.email = email;
    }

    public static User createUser(User user){
        return User.builder()
                .createBy(LocalDateTime.now())
                .updateBy(LocalDateTime.now())
                .name(user.name)
                .password(user.password)
                .email(user.email)
                .build();
    }
}
