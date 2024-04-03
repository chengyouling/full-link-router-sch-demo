package com.huaweicloud.servicestage.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.huaweicloud.servicestage.demo.entity.UserInfo;

@Mapper
@Repository
public interface UserMapper {
  UserInfo selectUserById(int id);
}
