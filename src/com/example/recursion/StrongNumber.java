package com.example.recursion;

public class StrongNumber {

    public static void main(String[] args) {

        int num = 145;
        int original = num;
        int sum = 0;

        while (num > 0) {

            int rem = num % 10;

            int fact = 1;

            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;

            num = num / 10;
        }

        if (original == sum) {
            System.out.println("Number is a strong number: " + original);
        } else {
            System.out.println("Number is not a strong number: " + original);
        }
    }
}