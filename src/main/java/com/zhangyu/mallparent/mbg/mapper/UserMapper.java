package com.zhangyu.mallparent.mbg.mapper;

import com.zhangyu.mallparent.mbg.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User selectByExample(@Param("username") String username);

}