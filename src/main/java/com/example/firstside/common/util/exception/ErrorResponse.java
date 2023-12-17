package com.example.firstside.common.util.exception;

import org.json.simple.JSONObject;

public class ErrorResponse {
    public static JSONObject jsonErrorResponse(int errorCode,String errorMessage){
       JSONObject jsonObject = new JSONObject();
       jsonObject.put("errorCode",errorCode);
       jsonObject.put("errorMessage",errorMessage);
        return jsonObject;
    }
}
