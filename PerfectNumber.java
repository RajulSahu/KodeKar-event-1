package com.rajul;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = isPerfect(num);
        System.out.println(ans);
    }
    static int isPerfect(int num) {
        int temp = num;
        int d, res = 0;
        while(num != 0){
            d = num % 10;
            res += factorial(d);
            num = num / 10;
        }
        return res == temp ? 1 : 0;
    }
    static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
