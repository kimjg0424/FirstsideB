package com.example.firstside.api.service;

import static org.springframework.http.HttpStatus.*;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.firstside.api.repository.CongressLibraryRepository;
import com.example.firstside.domain.book.dto.BookDTO;
import com.example.firstside.domain.congresslibrary.dto.CongressLibraryBookDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CongressLibraryService {

	private final CongressLibraryRepository congressLibraryRepository;


	public BookDTO bookSelect(CongressLibraryBookDTO congressLibraryBookDTO) {

		return congressLibraryRepository.bookSelect(congressLibraryBookDTO);
	}


}
