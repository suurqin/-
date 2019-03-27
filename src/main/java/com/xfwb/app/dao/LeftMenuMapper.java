package com.xfwb.app.dao;

import com.xfwb.app.entity.LeftMenu;
import com.xfwb.app.entity.LeftMenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeftMenuMapper {
    long countByExample(LeftMenuCriteria example);

    int deleteByExample(LeftMenuCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeftMenu record);

    int insertSelective(LeftMenu record);

    List<LeftMenu> selectByExample(LeftMenuCriteria example);

    LeftMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeftMenu record, @Param("example") LeftMenuCriteria example);

    int updateByExample(@Param("record") LeftMenu record, @Param("example") LeftMenuCriteria example);

    int updateByPrimaryKeySelective(LeftMenu record);

    int updateByPrimaryKey(LeftMenu record);
}