package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {
    public int add(User user);
    public int edit(User user);
    public int delete(int ids);
    public List<User> findList();

}
