package com.rajul;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = isHappyNumber(n);
        System.out.println(ans);
    }
    static int isHappyNumber(int num){
        while(num >= 10){
            num = calculatePower(num);
        }
        if(num == 1) return 1;
        else return 0;
    }
    static int calculatePower(int n) {
        int d, res = 0;
        while(n != 0){
            d = n % 10;
            res += d * d;
            n = n / 10;
        }
        return res;
    }
}
