package com.pear.manager.pojo;

import com.pear.common.base.entity.BaseEntity;

import java.io.Serializable;

/**
 * 系统权限
 * create by cx is 2018/4/23
 */
public class SysPermission extends BaseEntity implements Serializable {

    private String id;
    private String name;
    private String keyword;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
