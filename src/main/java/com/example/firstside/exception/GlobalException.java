package com.example.firstside.exception;


import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalException {

    @ExceptionHandler(UserException.class)
    public JSONObject duplicateEmailException() {
        return ErrorResponse.jsonErrorResponse(400," 중복된 이메일 입니다.");
    }
}
