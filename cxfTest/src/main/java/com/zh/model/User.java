package com.zh.model;

public class User  {
	
	private String id;
	private String name;
	private String info;
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", info=" + info + "]";
	}
	public User() {
		super();
	}
	public User(String id, String name, String info) {
		super();
		this.id = id;
		this.name = name;
		this.info = info;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getInfo() {
		return info;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	

}
