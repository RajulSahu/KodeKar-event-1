package com.rajul;
import java.util.*;

public class SmallestDivisibleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = smallestDivisible(n);
        System.out.println(ans);
    }
    static int smallestDivisible(int n){
        int finalLcm = 2;
        if(n <= 2){
            return 2;
        }
        for (int i = 3; i <= n; i++) {
            finalLcm = lcm(finalLcm, i);
        }
        return finalLcm;

    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a, int b){
        return (int)((a*b)/gcd(a,b));
    }
}
