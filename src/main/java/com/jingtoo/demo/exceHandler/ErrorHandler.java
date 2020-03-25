package com.jingtoo.demo.exceHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Object handlerRunnting() {
        return Error.gete(400,"服务器内部异常");
    }
}
