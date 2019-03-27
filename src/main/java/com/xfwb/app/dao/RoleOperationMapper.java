package com.xfwb.app.dao;

import com.xfwb.app.entity.RoleOperationCriteria;
import com.xfwb.app.entity.RoleOperationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleOperationMapper {
    long countByExample(RoleOperationCriteria example);

    int deleteByExample(RoleOperationCriteria example);

    int deleteByPrimaryKey(RoleOperationKey key);

    int insert(RoleOperationKey record);

    int insertSelective(RoleOperationKey record);

    List<RoleOperationKey> selectByExample(RoleOperationCriteria example);

    int updateByExampleSelective(@Param("record") RoleOperationKey record, @Param("example") RoleOperationCriteria example);

    int updateByExample(@Param("record") RoleOperationKey record, @Param("example") RoleOperationCriteria example);
}