package com.rajul;

import java.util.Scanner;

public class AddTwoFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        addTwoFractions(num1, num2, den1, den2);
    }
    static void addTwoFractions(int n1, int n2, int d1, int d2){
        int d3 = (d1*d2)/gcd(d1,d2);
        int n3 = ((n1 * (d3 / d1)) + (n2 * (d3 / d2)));
        int commonFactor = gcd(n3, d3);
        n3 = (int)(n3 / commonFactor);
        d3 = (int)(d3 / commonFactor);
        System.out.println(n3 + "/" + d3);

    }
    static int gcd(int a, int b) {
        if (a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
