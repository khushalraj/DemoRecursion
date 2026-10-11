package com.example.recursion;

public class FindSum {
public static void main(String[] args) {
	System.out.println("main method starts");
	System.out.println(test(100));
	System.out.println("main method ends");
}
public static int test(int n)
{
	if(n > 1)
	{
		return n+test(n-1);
	}
	else
	{
		return n;
	}
}
}
