package com.employeepayroll.employeepayroll.dto;

public class ResponseDTO {
    public String message;
    public Object data;

    public ResponseDTO( String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
