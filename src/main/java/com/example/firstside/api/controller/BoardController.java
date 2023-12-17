package com.example.firstside.api.controller;


import com.example.firstside.domain.board.dto.BoardDTO;
import com.example.firstside.api.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
@Slf4j
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board/list")
    public ResponseEntity boardList () {
        return ResponseEntity.status(HttpStatus.OK)
                .body(boardService.boardList());
    }






    @PostMapping(value = "/board")
    public BoardDTO boardCreate (@Valid @RequestBody BoardDTO boardDto) {
        return boardService.boardCreate(boardDto);
    }

    @GetMapping("/board/{id}")
    public BoardDTO boardSelect (@Valid @PathVariable Long id) {
        return boardService.boardSelect(id);
    }

    @DeleteMapping("/board/{id}")
    public BoardDTO boardDelete (@PathVariable Long id) {
            log.info("boardList 수행");
         return boardService.boardDelete(id);
    }






}
