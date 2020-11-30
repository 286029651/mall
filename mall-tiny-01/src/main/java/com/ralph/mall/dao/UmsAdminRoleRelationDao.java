package com.ralph.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ralph.mall.domain.UmsPermission;

/**
 * @author Ralph.Chen
 * @date 2020/11/26
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
