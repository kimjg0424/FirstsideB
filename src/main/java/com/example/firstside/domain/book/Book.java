package com.example.firstside.domain.book;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Book {

    @GeneratedValue
    @Id
    private long id;

    private String name;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;

    private String Category;

    @Builder
    private Book(String name, LocalDateTime createBy,
                LocalDateTime updateBy, String category) {
        this.name = name;
        this.createBy = createBy;
        this.updateBy = updateBy;
        Category = category;
    }

    public static Book createBook(String name, LocalDateTime createBy,
                                  LocalDateTime updateBy, String category) {
        return Book.builder()
                .name(name)
                .category(category)
                .updateBy(updateBy)
                .createBy(createBy)
                .build();
    }


}
