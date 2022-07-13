package com.galvanize;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 2;
        if (num < 2) {
            System.out.println(1);
        } else if (num <= 0) {
            System.out.println("Please enter a valid integer");
        } else {
            int prev = 1;
            int cur = 1;
            int temp;

            for (int n = 2; n < num; n++) {
                temp = prev;
                prev = cur;
                cur += temp;
            }
            System.out.println(cur);
        }
    }
}

//  1 1 2 3 5