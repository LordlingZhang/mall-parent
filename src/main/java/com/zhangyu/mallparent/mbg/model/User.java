package com.zhangyu.mallparent.mbg.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String address;

    private Date birthday;

    private Integer departmentId;

}