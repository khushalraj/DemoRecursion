package com.example.recursion;

public class HCFExample {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		int result = 0;

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				result = i;
			}
		}
		System.out.println(" HCL is: " + result);
	}
}
