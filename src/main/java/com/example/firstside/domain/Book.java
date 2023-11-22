package com.example.firstside.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicUpdate
public class Book {

    @GeneratedValue
    @Id
//    @Column(name = "ID", nullable = false)
    private long Id;

//    @Column(name = "NAME", nullable = false)
    private String name;
//    @Column(name = "CREATE_BY", nullable = false)
    private LocalDateTime createBy;
//    @Column(name = "UPDATE_BY", nullable = false)
    private LocalDateTime updateBy;
//    @Column(name = "CATEGORY", nullable = false)
    private String Category;


}
