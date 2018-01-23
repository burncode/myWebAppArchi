package com.example.springboot.demo.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springboot.demo.bean.Document;

@Controller
@RequestMapping(path = "/api/v1/document")
public class DocController {
	
	@RequestMapping("/docList")
	@ResponseBody
	public List<Document> getDocList(){
		List<Document> result = new ArrayList<Document>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for(int i = 0; i < 200;i++){
			Document d = new Document(i, "title"+i, "author", sdf.format(new Date()), "doc");
			result.add(d);
		}
		
		return result;
	}

}
