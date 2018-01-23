package com.example.springboot.demo.bean;

public class Document {
	
	private int doc_id;
	private String title;
	private String author;
	private String updateTime;
	private String docType;
	
	public Document(int doc_id, String title, String author, String updateTime, String docType) {
		this.doc_id = doc_id;
		this.title = title;
		this.author = author;
		this.updateTime = updateTime;
		this.docType = docType;
	}
	
	//getters and setters
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}

}
