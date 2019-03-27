package com.xfwb.app.dao;

import com.xfwb.app.entity.HeadMenu;
import com.xfwb.app.entity.HeadMenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeadMenuMapper {
    long countByExample(HeadMenuCriteria example);

    int deleteByExample(HeadMenuCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(HeadMenu record);

    int insertSelective(HeadMenu record);

    List<HeadMenu> selectByExample(HeadMenuCriteria example);

    HeadMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HeadMenu record, @Param("example") HeadMenuCriteria example);

    int updateByExample(@Param("record") HeadMenu record, @Param("example") HeadMenuCriteria example);

    int updateByPrimaryKeySelective(HeadMenu record);

    int updateByPrimaryKey(HeadMenu record);
}