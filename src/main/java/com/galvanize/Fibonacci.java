package com.galvanize;

public class Fibonacci {
    public static Boolean runFiobonacci(int num, int target) {


        if (num > 0 && target == 1) {
            return true;
        } else if (num <= 0) {
            System.out.println("Please enter a valid integer");
        } else {
            int prev = 1;
            int cur = 1;
            int temp;

            for (int index = 2; index <= num; index++) {

                temp = prev;
                prev = cur;
                cur += temp;

                if (cur > target) {
                    return false;
                } else if (cur == target) {
                    return true;
                }
            }
        }
        return false;


    }

    public static void main(String[] args) {
        int num = 2;
        int target = 5;
        System.out.println(runFiobonacci(num, target));
    }
}

//  1 1 2 3 5