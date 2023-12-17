package com.example.firstside.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.example.firstside.domain.board.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {






}
