package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User {
    @TableId
    private  Integer id;
    private  String name;
    private  String phone;
    private  String address;
}
