package com.workintech.s18g1.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class BurgerErrorResponse {

    private  String message;
    private HttpStatus status;
    private long timestamp;
}
