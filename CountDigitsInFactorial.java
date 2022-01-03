package com.rajul;

import java.util.Scanner;

public class CountDigitsInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = digitsInFact(num);
        System.out.println(digits);
    }
    static int digitsInFact(int num){
        long factorial = calcFact(num);
        int digits = 0;
        while(factorial != 0){
            digits++;
            factorial = factorial / 10;
        }
        return digits;
    }
    static long calcFact(int n){
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
