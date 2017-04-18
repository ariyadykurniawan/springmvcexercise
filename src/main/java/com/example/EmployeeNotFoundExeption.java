package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
    value = HttpStatus.NOT_FOUND,
    reason = "DATA NOT FOUND"
)

public class EmployeeNotFoundExeption extends RuntimeException{
	
}
