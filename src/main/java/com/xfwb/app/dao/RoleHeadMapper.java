package com.xfwb.app.dao;

import com.xfwb.app.entity.RoleHeadCriteria;
import com.xfwb.app.entity.RoleHeadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleHeadMapper {
    long countByExample(RoleHeadCriteria example);

    int deleteByExample(RoleHeadCriteria example);

    int deleteByPrimaryKey(RoleHeadKey key);

    int insert(RoleHeadKey record);

    int insertSelective(RoleHeadKey record);

    List<RoleHeadKey> selectByExample(RoleHeadCriteria example);

    int updateByExampleSelective(@Param("record") RoleHeadKey record, @Param("example") RoleHeadCriteria example);

    int updateByExample(@Param("record") RoleHeadKey record, @Param("example") RoleHeadCriteria example);
}