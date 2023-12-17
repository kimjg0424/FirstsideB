package com.example.firstside.domain.bookloans;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class BookLoans {

    @GeneratedValue @Id
    private long id;

    private String name;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;

    private String status;

    private String Category;
    @Builder
    public BookLoans(long id, String name, LocalDateTime createBy
            , LocalDateTime updateBy, String status, String category) {
        this.id = id;
        this.name = name;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.status = status;
        Category = category;
    }



}
