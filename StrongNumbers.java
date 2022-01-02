package com.rajul;

import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        strongNumbers(limit);
    }
    static void strongNumbers(int limit){
        for (int i = 1; i <= limit ; i++) {
            if(isStrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isStrong(int num){
        int temp = num;
        int d, sum = 0;
        while(num != 0){
            d = num % 10;
            sum += factorial(d);
            num = num / 10;
        }
        return (sum == temp);
    }
    static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
