package com.rajul;

import java.util.Scanner;

public class FightingTheDarkness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candles = new int[n];
        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }
        int days = maxNumberOfDays(candles);
        System.out.println(days);
    }
    static int maxNumberOfDays(int[] candles){
        int max = candles[0];
        for (int i = 1; i < candles.length; i++) {
            max = Math.max(max, candles[i]);
        }
        return max;
    }
}
