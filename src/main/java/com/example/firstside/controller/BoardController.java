//package com.example.firstside.controller;
//
//
//import com.example.firstside.domain.Board;
//import com.example.firstside.service.BoardService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RequestMapping("/api")
//@RestController
//@RequiredArgsConstructor
//@Slf4j
//@CrossOrigin(origins = "http://localhost:3000")
//public class BoardController {
//
//    private final BoardService boardService;
//
//
//    @GetMapping("/")
//    public List<Board> Hello () {
//            log.info("boardList 수행");
//        return boardService.boardList();
//    }
//
//
//
//    @GetMapping("/boardList")
//    public List<Board> boardList () {
//            log.info("boardList 수행");
//        return boardService.boardList();
//    }
//
//}
