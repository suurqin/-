package com.xfwb.app.dao;

import com.xfwb.app.entity.RoleLeftCriteria;
import com.xfwb.app.entity.RoleLeftKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleLeftMapper {
    long countByExample(RoleLeftCriteria example);

    int deleteByExample(RoleLeftCriteria example);

    int deleteByPrimaryKey(RoleLeftKey key);

    int insert(RoleLeftKey record);

    int insertSelective(RoleLeftKey record);

    List<RoleLeftKey> selectByExample(RoleLeftCriteria example);

    int updateByExampleSelective(@Param("record") RoleLeftKey record, @Param("example") RoleLeftCriteria example);

    int updateByExample(@Param("record") RoleLeftKey record, @Param("example") RoleLeftCriteria example);
}