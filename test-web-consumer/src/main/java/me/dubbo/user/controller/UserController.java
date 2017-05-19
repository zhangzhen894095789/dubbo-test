package me.dubbo.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.dubbo.user.service.UserService;

@Controller
public class UserController {
    
    @Resource(name="userService")
    private UserService userService;
    
    
    @RequestMapping("/hello/test/world")
    public void sayHello(){
        System.out.println(userService.sayHello()+"**************************");
    }
}