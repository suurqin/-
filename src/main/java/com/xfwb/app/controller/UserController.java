package com.xfwb.app.controller;

import com.xfwb.app.entity.Test;
import com.xfwb.app.entity.User;
import com.xfwb.app.service.TestService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Resource
    private TestService testService;

    @RequestMapping("getUser")
    public User getUser(){
        User user = new User();
        user.setName("han");
        return user;
    }
    @RequestMapping("getTest")
    public Test getTest(HttpServletRequest request){
        return testService.getUserById(Integer.parseInt(request.getParameter("id")));
    }
}
