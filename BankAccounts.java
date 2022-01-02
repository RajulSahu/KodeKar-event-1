package com.rajul;

import java.util.Scanner;

public class BankAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acc1 = sc.nextInt();
        int acc2 = sc.nextInt();
        boolean ans = lastDigit(acc1, acc2);
        System.out.println(ans);
    }
    static boolean lastDigit(int a, int b){
        return (a % 10 == b % 10);
    }
}
