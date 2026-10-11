package com.example.recursion;

public class LCMExample {
	public static void main(String[] args) {

		int num1 = 4;
		int num2 = 6;
		int result = 0;

		for (int i = 1; i <= num2; i++) {
			int multiple = num1 * i;
			if (multiple % num2 == 0) {
				result = multiple;
				break;
			}
		}

		System.out.println(" LCM is: " + result);
	}
}
