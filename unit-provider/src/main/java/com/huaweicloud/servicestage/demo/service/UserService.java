package com.huaweicloud.servicestage.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaweicloud.servicestage.demo.entity.UserInfo;
import com.huaweicloud.servicestage.demo.mapper.UserMapper;

@Service
public class UserService {
  @Autowired
  private UserMapper userMapper;

  public UserInfo queryUserInfoById(int id) {
    return userMapper.selectUserById(id);
  }
}
