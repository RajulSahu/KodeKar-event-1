package com.rajul;

import java.util.Scanner;

public class SumWithoutArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = getSum(a,b);
        System.out.println(ans);
    }
    static int getSum(int a, int b){
        if(a < b){
            for (int i = 1; i <= a; i++) {
                b++;
            }
            return b;
        }
        else{
            for (int i = 1; i <= b; i++) {
                a++;
            }
            return a;
        }
    }
}
