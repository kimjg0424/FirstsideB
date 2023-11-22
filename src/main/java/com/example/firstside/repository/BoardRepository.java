package com.example.firstside.repository;


import com.example.firstside.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {


    Board save(Board board);

    Optional<Board> findById(Long id);

    void delete(Board board);

    List<Board> findAll();



}
