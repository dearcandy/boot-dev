package com.example.dev.dao;

import com.example.dev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author liuhangfei
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
