package com.pear.manager.service.dao;

import com.pear.manager.pojo.SysAdmin;
import org.apache.ibatis.annotations.Mapper;

/**
 * create by cx is 2018/4/23
 */
@Mapper
public interface SysAdminDao {

   int insertSysAdmin(SysAdmin entity)throws Exception;

}
