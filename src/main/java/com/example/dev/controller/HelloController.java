package com.example.dev.controller;


import com.example.dev.common.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhangfei
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public ResponseResult<String> test(){
        return ResponseResult.success("success");
    }
}
