package com.example.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping("/userConfig")
	public String userConfig(){
		return "userConfig";
	}
	
	@RequestMapping("/menuConfig")
	public String menuConfig(){
		return "menuConfig";
	}
	
	@RequestMapping("/pageConfig")
	public String pageConfig(){
		return "pageConfig";
	}
	
	@RequestMapping("/help")
	public String help(){
		return "help";
	}
	
	@RequestMapping("/contact")
	public String contact(){
		return "contact";
	}
	
	@RequestMapping("/getPage")
	public String getPage(@RequestParam String pageName){
		return pageName;
	}
	
	@RequestMapping("/myTemplate")
	public String myTemplate(@RequestParam String pageName){
		return pageName;
	}
	
	
}
