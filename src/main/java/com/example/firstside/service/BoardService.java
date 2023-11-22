package com.example.firstside.service;

import com.example.firstside.domain.Board;
import com.example.firstside.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public List<Board> boardList(){
       return   boardRepository.findAll();
    }










}
