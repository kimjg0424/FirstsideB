package com.example.firstside.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstside.api.service.BookService;
import com.example.firstside.domain.book.dto.BookDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService;

	@GetMapping("/Book")
	public BookDTO BookTest() {
		return new BookDTO();
	}

}
