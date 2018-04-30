package com.pear.manager.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pear.manager.pojo.SysAdmin;
import org.springframework.stereotype.Repository;

/**
 * create by cx is 2018/4/23
 */
@Repository
public interface SysAdminDao extends BaseMapper<SysAdmin> {

   int insertSysAdmin(SysAdmin entity)throws Exception;

}
