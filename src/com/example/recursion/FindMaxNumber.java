package com.example.recursion;

public class FindMaxNumber {
	public static void main(String[] args) {

		int arr[] = { 10, 25, 7, 42, 18 };
		int largest = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
        	if(arr[i] > largest)
        	{
        		largest = arr[i];
        	}
        }
        System.out.println(" max element is : "+largest);
	}
}
