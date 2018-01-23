package com.example.springboot.demo.bean.meta;

public class ContentPage {
	
	private String content;
	private String url;
	
	public ContentPage(String content, String url) {
		this.content = content;
		this.url = url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
