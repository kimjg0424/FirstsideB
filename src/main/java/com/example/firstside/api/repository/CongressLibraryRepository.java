package com.example.firstside.api.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.firstside.domain.book.dto.BookDTO;
import com.example.firstside.domain.congresslibrary.dto.CongressLibraryBookDTO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class CongressLibraryRepository {


	private WebClient congressLibraryWebClient;

	 public void congressLibraryWebClient(@Qualifier("congressLibraryWebClient") WebClient congressLibraryWebClient) {
        this.congressLibraryWebClient = congressLibraryWebClient;
    }



	public BookDTO bookSelect(CongressLibraryBookDTO congressLibraryBookDTO){

	log.info("param ={}",congressLibraryBookDTO);


		congressLibraryWebClient.get()
					.uri(uriBuilder ->
						uriBuilder
							.path(String.format("/"))


							.build());

		return new BookDTO();
	}


}
