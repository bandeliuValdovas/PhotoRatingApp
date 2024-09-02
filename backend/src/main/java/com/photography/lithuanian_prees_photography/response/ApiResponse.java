package com.photography.lithuanian_prees_photography.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApiResponse<T> {
    private int statusCode;
    private String message;
    private T data;
}