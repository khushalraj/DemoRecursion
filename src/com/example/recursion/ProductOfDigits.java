package com.example.recursion;

public class ProductOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		int prod = 1;
		while (num > 0) {
			int rem = num % 10;
			prod = prod * rem;
			num = num / 10;
		}
		System.out.println(" product of digits: " + prod);
	}
}
