package com.pear.manager.dao;

import com.pear.manager.pojo.SysAdmin;
import org.springframework.stereotype.Repository;

/**
 * create by cx is 2018/4/23
 */
@Repository
public interface SysAdminDao {

   int insertSysAdmin(SysAdmin entity)throws Exception;

}
