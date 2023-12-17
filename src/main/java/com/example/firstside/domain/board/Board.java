package com.example.firstside.domain.board;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.example.firstside.domain.board.dto.BoardDTO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@EqualsAndHashCode
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String title;

	@Lob
	private String content;

	private LocalDateTime createBy;

	private LocalDateTime updateBy;

	private int views;

	private String author;

	private int likes;

	//    @Enumerated(EnumType.STRING)
	//    @JoinColumn(name = "user_id")
	//    @ManyToOne(fetch = FetchType.LAZY)
	//    private User user;

	public static Board createBoard(BoardDTO boardDTO) {
		return Board.builder()
			.id(boardDTO.getId())
			.content(boardDTO.getContent())
			.likes(boardDTO.getLikes())
			.title(boardDTO.getTitle())
			.views(boardDTO.getViews())
			.author(boardDTO.getAuthor())
			.createBy(LocalDateTime.now())
			.updateBy(LocalDateTime.now())
			.build();
	}

}
