package com.pear.manager.pojo;

import com.pear.common.base.entity.BaseEntity;

import java.io.Serializable;

/**
 * 角色和权限关系实体
 * create by cx is 2018/4/24
 */
public class RolePermission extends BaseEntity implements Serializable{
    private String roleId;
    private String PermissionId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String permissionId) {
        PermissionId = permissionId;
    }
}
