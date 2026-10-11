package com.example.recursion;

public class DemoRecursion {
public static void main(String[] args) {

	System.out.println("This is main method");
	test(3);
	System.out.println("main method ends");
}
public static void test(int n)
{
	if(n > 1)
	{
		System.out.println(n);
		test(n-1);
	}
	else
	{
		System.out.println(n);
	}
}
}
