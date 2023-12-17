package com.example.firstside.api.service;

import static com.example.firstside.common.config.MapstructConfig.*;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.firstside.api.repository.BoardRepository;
import com.example.firstside.domain.board.Board;
import com.example.firstside.domain.board.dto.BoardDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class BoardService {

	private final BoardRepository boardRepository;

	@Transactional(readOnly = true)
	public List<BoardDTO> boardList() {
		return boardRepository.findAll().stream()
			.map(board -> CONVATER.boardEntityToBoardDTO(board))
			.collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public BoardDTO boardSelect(Long id) {
		Board board = boardRepository.findById(id)
			.orElseThrow();
		return CONVATER.boardEntityToBoardDTO(board);
	}

	@Transactional
	public BoardDTO boardCreate(BoardDTO boardDto) {
		Board responseBoard = boardRepository.save(CONVATER.DTOToBoardEntity(boardDto));
		return CONVATER.boardEntityToBoardDTO(responseBoard);

	}

	@Transactional
	public BoardDTO boardDelete(Long id) {
		Board board = boardRepository.findById(id)
			.orElseThrow();
		boardRepository.delete(board);
		return CONVATER.boardEntityToBoardDTO(board);
	}
}
