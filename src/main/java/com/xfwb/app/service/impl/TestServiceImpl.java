package com.xfwb.app.service.impl;

import com.xfwb.app.dao.TestMapper;
import com.xfwb.app.entity.Test;
import com.xfwb.app.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;
    @Override
    public Test getUserById(int id) {
        return testMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean addUser(Test test) {
        return false;
    }
}
