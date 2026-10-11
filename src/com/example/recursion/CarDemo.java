package com.example.recursion;

public class CarDemo {
public static void main(String[] args) {
		Car c = new Car();
		c.name = "Audi";
		c.price = 1234.01;
		c.color = "black";
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c);
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50000;
		c1.color = "white";
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1);
		c.drive();
//		System.out.println(c);
//		Car c1 =  new Car();
//		System.out.println(c1);
		
	
//	Employee e = new Employee();
//	System.out.println(e);
//	Employee e1 = new Employee();
//	System.out.println(e1);
//	System.out.println(e==e1);
}
}
