package com.pear.manager.pojo;

import com.pear.common.base.entity.BaseEntity;

import java.io.Serializable;

/**
 *  系统管理员和系统角色关系实体
 * create by cx is 2018/4/24
 */
public class AdminRole extends BaseEntity implements Serializable{
    private String adminId;
    private String roleId;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
