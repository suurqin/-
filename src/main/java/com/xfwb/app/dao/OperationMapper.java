package com.xfwb.app.dao;

import com.xfwb.app.entity.Operation;
import com.xfwb.app.entity.OperationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationMapper {
    long countByExample(OperationCriteria example);

    int deleteByExample(OperationCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Operation record);

    int insertSelective(Operation record);

    List<Operation> selectByExample(OperationCriteria example);

    Operation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Operation record, @Param("example") OperationCriteria example);

    int updateByExample(@Param("record") Operation record, @Param("example") OperationCriteria example);

    int updateByPrimaryKeySelective(Operation record);

    int updateByPrimaryKey(Operation record);
}