package com.example.springboot.demo.bean.meta;

public class SubMenu {
	
	private String menuName;
	private ContentPage contentPage;
	
	public SubMenu(String menuName) {
		this.menuName = menuName;
	}
	public SubMenu(String menuName, ContentPage contentPage) {
		this.menuName = menuName;
		this.contentPage = contentPage;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public ContentPage getContentPage() {
		return contentPage;
	}
	public void setContentPage(ContentPage contentPage) {
		this.contentPage = contentPage;
	}

}
