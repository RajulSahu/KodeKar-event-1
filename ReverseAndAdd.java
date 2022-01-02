package com.rajul;

import java.util.Scanner;

public class ReverseAndAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = revAndAdd(num);
        System.out.println(ans);
    }
    static int revAndAdd(int num) {
        while(true) {
            if (isPalindrome(num)) return num;
            int rev = 0, d, temp = num;
            while (num != 0) {
                d = num % 10;
                rev = rev * 10 + d;
                num = num / 10;
            }
            num = temp + rev;
        }
    }
    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0, d;
        while(num != 0){
            d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        return (temp == rev);
    }
}
