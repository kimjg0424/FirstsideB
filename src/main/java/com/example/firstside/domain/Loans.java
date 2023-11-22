package com.example.firstside.domain;


import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
public class Loans {

    @GeneratedValue @Id
    private long id;

    private String name;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;

    private String status;

    private String Category;



}
