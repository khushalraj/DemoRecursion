package com.example.recursion;

public class ArmtrongNumber {
	public static void main(String[] args) {
		int num = 153;
        int sum = 0;
        int original = num;
		while (num > 0) {
			int rem = num % 10;
			int cube = rem * rem * rem;
			sum  = sum+cube;
			num = num / 10;

		}
		if(original == sum)
		{
			System.out.println(" number is aremstrong number : "+original);
		}
		else
		{
			System.out.println(" number is not aremstrong number : "+original);
		}

	}
}
