package com.example.recursion;

public class DemoRecursion1 {
public static void main(String[] args) {
	System.out.println("The sum is:"+sum(20,70));
	System.out.println("The sum is:"+sum(sum(20,70),80));
	System.out.println("The sum is:"+sum(sum(20,70),sum(80,100)));
	
}
public static int sum(int a, int b)
{
	return a+b;
}
}
