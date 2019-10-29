package com.zhangyu.mallparent.dao;

import com.zhangyu.mallparent.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhangyu
 * @description 后台用户与角色管理自定义Dao
 * @date 2019/9/26
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
