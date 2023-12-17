package com.example.firstside.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorResourceFactory;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

  private final String CONGRESS_LIBRARY_API_KEY=
    "[d9e90dcc39933b3b8ad748f0bb6ccde236bf2c6eac1d701f462df6ff448375ab]";


  // @Bean
  // public ReactorResourceFactory resourceFactory() {
  //   ReactorResourceFactory factory = new ReactorResourceFactory();
  //   factory.setUseGlobalResources(false);
  //   return factory;
  // }

  @Bean
  public WebClient congressLibraryWebClient(){
    return WebClient.builder()
      .baseUrl("https://www.nl.go.kr/NL/search/openApi/search.do?key="
               +CONGRESS_LIBRARY_API_KEY)
      .build();
  }

  @Bean
  public WebClient nationalLibraryWebClient(){
    return WebClient.builder()
      .baseUrl("https://www.nl.go.kr/NL/search/openApi/search.do")
      .build();
  }

}