package com.jaden.tmall.dao;

import com.jaden.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByName(String name);
    User getByNameAndPassword(String name, String password);
}