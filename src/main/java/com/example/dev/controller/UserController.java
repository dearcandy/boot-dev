package com.example.dev.controller;

import com.example.dev.common.ResponseResult;
import com.example.dev.entity.User;
import com.example.dev.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuhangfei
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/list")
    public ResponseResult<List<User>> list(){
        return ResponseResult.success(userService.list());
    }
}


