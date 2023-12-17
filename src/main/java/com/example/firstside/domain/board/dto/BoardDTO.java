package com.example.firstside.domain.board.dto;


import com.example.firstside.domain.board.Board;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="board")
@DynamicUpdate
public class BoardDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Lob
    private String content;

    private LocalDateTime createBy;

    private LocalDateTime updateBy;


    private int views;

    private int likes;

    private String author;

//    @Enumerated(EnumType.STRING)
//    @JoinColumn(name = "user_id")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private UserDTO userDTO;



    public static Board createBoardDTO(Board board){
        return Board.builder()
                .id(board.getId())
                .content(board.getContent())
                .likes(board.getLikes())
                .title(board.getTitle())
                .views(board.getViews())
                .createBy(LocalDateTime.now())
                .updateBy(LocalDateTime.now())
                .author(board.getAuthor())
                .build();
    }

}
