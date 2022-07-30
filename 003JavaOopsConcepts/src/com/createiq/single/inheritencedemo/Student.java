package com.createiq.single.inheritencedemo;

public class Student {

	private int id;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

//	public String toString() {
//		return "[" + "ID: "+id +" Name: "+ name + "]";
//	}

	public static void main(String[] args) {
		Student student = new Student(1, "anil");
		System.out.println(student);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
