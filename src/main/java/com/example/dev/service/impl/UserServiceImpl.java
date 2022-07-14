package com.example.dev.service.impl;


import com.example.dev.dao.UserRepository;
import com.example.dev.entity.User;
import com.example.dev.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuhangfei
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
