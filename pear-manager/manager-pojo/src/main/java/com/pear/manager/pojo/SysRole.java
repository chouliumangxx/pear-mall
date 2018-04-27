package com.pear.manager.pojo;

import com.pear.common.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 系统角色实体
 * create by cx is 2018/4/23
 */
public class SysRole extends BaseEntity implements Serializable {

    private String id;
    private String name;
    private String keyword;
    private String sysflag;
    private String description;

    private Set<SysPermission> sysPermissions = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSysflag() {
        return sysflag;
    }

    public void setSysflag(String sysflag) {
        this.sysflag = sysflag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<SysPermission> getSysPermissions() {
        return sysPermissions;
    }

    public void setSysPermissions(Set<SysPermission> sysPermissions) {
        this.sysPermissions = sysPermissions;
    }
}
