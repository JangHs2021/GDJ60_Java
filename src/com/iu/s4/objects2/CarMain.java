package com.iu.s4.objects2;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.info();
		
		Car c2 = new Car("Red");
		c2.info();
		
		Car c3 = new Car("Green", 2000);
		c3.info();
		
		Car c4 = new Car("White", 5000, "K9");
		c4.info();
	}
}
