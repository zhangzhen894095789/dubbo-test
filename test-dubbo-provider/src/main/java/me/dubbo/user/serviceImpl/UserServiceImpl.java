package me.dubbo.user.serviceImpl;

import org.springframework.stereotype.Service;

import me.dubbo.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	public String sayHello() {
		System.out.println("hello world----------------------------");
        
        return "hello world";
	}

}
