package com.rajul;

import java.util.Scanner;

public class MaximumMoney1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houses = sc.nextInt();
        int money = sc.nextInt();
        int ans = maximumTheft(houses, money);
        System.out.println(ans);
    }
    static int maximumTheft(int houses, int money){
        int theft = 0;
        for (int i = 1; i <= houses; i+=2) {
            theft += money;
        }
        return theft;
    }
}
