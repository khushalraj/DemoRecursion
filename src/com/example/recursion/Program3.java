package com.example.recursion;

public class Program3 {
	
	 static int a=10;
	
	public void printValue()
	{
		int a =30;
		//Program3.a = 20;	
		System.out.println(Program3.a);
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		//System.out.println(" a value "+a);
		Program3 p3 = new Program3();
		//System.out.println(""+p3.a);
		p3.printValue();
		
	}

}
