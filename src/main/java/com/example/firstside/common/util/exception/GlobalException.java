package com.example.firstside.common.util.exception;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalException extends ResponseEntityExceptionHandler {


    @ExceptionHandler(duplicateEmailException.class)
    public JSONObject duplicateEmailException(RuntimeException e) {
        log.error("error []",e);
        return ErrorResponse.jsonErrorResponse(400," 중복된 이메일 입니다.");
    }

    @ExceptionHandler(BoardException.class)
    public ResponseEntity<?> boardNullException(BoardException e) {
        log.error("error []",e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserDeleteException.class)
    public ResponseEntity<?> UserDeleteException(UserDeleteException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> NullException(RuntimeException e) {
        return new ResponseEntity<>("NullPointerException", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
