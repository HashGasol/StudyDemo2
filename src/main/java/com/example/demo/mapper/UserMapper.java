package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.domain.User;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends BaseMapper<User> {
     int add(User user);
     int edit(User user);
     int delete(int ids);
     List<User> findList();

}
