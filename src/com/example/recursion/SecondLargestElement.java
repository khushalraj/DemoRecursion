package com.example.recursion;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 7, 42, 18, 35 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int num : arr)
		{
			if(num > largest)
			{
				largest = num;
				secondLargest = largest;
			}
			else if (num != largest && num >= largest) {
				secondLargest = num;
			}
		}
		System.out.println(" second largest : "+secondLargest);

	}
}
