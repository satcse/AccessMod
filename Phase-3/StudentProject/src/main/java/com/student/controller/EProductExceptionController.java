package com.student.controller;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.student.exceptions.StudentNotFoundException;
 
@ControllerAdvice // Take care of making this Exception visible at the Application level.
public class EProductExceptionController {
 
        @ExceptionHandler(value = StudentNotFoundException.class)
           public ResponseEntity<Object> exception(StudentNotFoundException exception) {
              return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
           }
}
