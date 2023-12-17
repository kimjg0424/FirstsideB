package com.example.firstside.api.controller;

import static org.springframework.http.HttpStatus.*;

import java.util.Map;

import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstside.api.service.CongressLibraryService;
import com.example.firstside.domain.book.dto.BookDTO;
import com.example.firstside.domain.congresslibrary.dto.CongressLibraryBookDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/congressLibrary")
@RequiredArgsConstructor
@Slf4j
public class CongressLibraryController {

	private final CongressLibraryService congressLibraryService;



	@PostMapping("/select")
	public ResponseEntity bookSelect(@RequestBody  CongressLibraryBookDTO congressLibraryBookDTO) {

		log.info("con ={}",congressLibraryBookDTO.getApiType());
		log.info("con2 ={}",congressLibraryBookDTO.getPageSize());
		log.info("con3 ={}",congressLibraryBookDTO.getLicYn());


		// return ResponseEntity.
		// 	   ok(congressLibraryService.bookSelec t(congressLibraryBookDTO));
		return null;
	}

}
