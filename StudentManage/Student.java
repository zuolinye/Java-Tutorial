package com.itheima;
/*
 * 这是我的学生类
 * */
public class Student {
	//学号
	private String id;
	//姓名
	private String name;
	//年龄
	private String age;
	//居住地
	private String address;
	
	//生成无参构造方法：给对象的数据进行初始化
	public Student() {
	}
	//生成带参构造方法：给对象的数据进行初始化
	public Student(String id, String name, String age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//生成get、set方法
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
