package com.example.firstside.common.util.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResult {
  private String code;
  private String message;

}
