package com.iu.s4.objects4;

public class Card {
	// Card
	private String shape;
	private int number;
	private String color;
	
	public static int size = 10;
	
	public void info() {
		System.out.println("Shape : " + this.shape);
		System.out.println("Color : " + this.color);
		System.out.println("Number : " + this.number);
		System.out.println("Size : " + this.size);
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
