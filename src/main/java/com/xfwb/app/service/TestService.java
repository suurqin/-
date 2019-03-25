package com.xfwb.app.service;

import com.xfwb.app.entity.Test;

public interface TestService {
    public Test getUserById(int id);

    boolean addUser(Test test);
}
