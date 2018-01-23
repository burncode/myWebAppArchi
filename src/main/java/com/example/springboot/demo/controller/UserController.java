package com.example.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springboot.demo.bean.meta.User;

@Controller
@RequestMapping(path = "/api/v1/user")
public class UserController {

	@RequestMapping("/userList")
	@ResponseBody
	public List<User> getUsers(){
		
		List<User> result = new ArrayList<User>();
		
		for(int i = 0; i < 800;i++){
			result.add(new User(i, "user" + i, "123456"));
		}
		
		return result;
	}
	
}
