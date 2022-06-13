package com.userService.userService.ExceptionHandler;
import com.userService.userService.Util.AppRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(value = {UserNotFound.class, NoHandlerFoundException.class})
    public ResponseEntity<AppRes> notFoundHandler(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        new AppRes("fail", ex.getMessage())
                );
    }

}
