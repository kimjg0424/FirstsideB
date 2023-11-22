package com.example.firstside.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamicUpdate
public class User {

    @GeneratedValue
    @Id
    private long id;

    private String name;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;

//    @Enumerated(EnumType.STRING)
    private String grade;

    private String password;

    private String email;

}
