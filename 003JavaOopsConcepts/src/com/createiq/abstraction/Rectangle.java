package com.createiq.abstraction;

public class Rectangle extends Shape {

	public Integer length;
	
	public Integer breadth;
	
	

	public Rectangle(String color, Integer length, Integer breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length+breadth;
	}

}
