package com.xfwb.app.dao;

import com.xfwb.app.entity.Employee;
import com.xfwb.app.entity.EmployeeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeCriteria example);

    int deleteByExample(EmployeeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeCriteria example);

    Employee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeCriteria example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeCriteria example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}