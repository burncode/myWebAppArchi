package com.example.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springboot.demo.bean.meta.WebsiteMap;

@Controller
@RequestMapping(path = "/api/v1/websitemap")
public class WebsiteMapController {
	
	@Autowired
	private WebsiteMap sitemap;
	
	@RequestMapping(path = "")
	@ResponseBody
	public WebsiteMap webSiteMap(){
		return sitemap;
	}

}
