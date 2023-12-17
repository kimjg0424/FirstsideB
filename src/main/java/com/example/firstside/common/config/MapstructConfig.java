package com.example.firstside.common.config;


import com.example.firstside.domain.board.Board;
import com.example.firstside.domain.board.dto.BoardDTO;
import com.example.firstside.domain.congresslibrary.dto.CongressLibraryBookDTO;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapstructConfig {
   MapstructConfig CONVATER = Mappers.getMapper(MapstructConfig.class);

   BoardDTO  boardEntityToBoardDTO(Board board);

   Board  boardDTOToBoardEntity(BoardDTO board);

   Board  DTOToBoardEntity(CongressLibraryBookDTO congressLibraryBookDTO);

         Board  DTOToBoardEntity(BoardDTO board);




}
