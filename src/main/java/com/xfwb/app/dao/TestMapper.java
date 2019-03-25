package com.xfwb.app.dao;

import com.xfwb.app.entity.Test;
import com.xfwb.app.entity.TestCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    long countByExample(TestCriteria example);

    int deleteByExample(TestCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestCriteria example);

    Test selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestCriteria example);

    int updateByExample(@Param("record") Test record, @Param("example") TestCriteria example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}