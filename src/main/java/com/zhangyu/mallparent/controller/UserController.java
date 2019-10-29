package com.zhangyu.mallparent.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.zhangyu.mallparent.mbg.mapper.UserMapper;
import com.zhangyu.mallparent.mbg.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangyu
 * @description
 * @date 2019/10/29
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserMapper userMapper;
    @RequestMapping("queryUser")
    @ResponseBody
    public String queryUser(String username){
        User user = userMapper.selectByExample(username);
        return JSONUtil.toJsonStr(user);
    }
}
