package com.rajul;

//Today is ron's 21st birthday. His mom brought a cake for him.
// There are multiple number candles on that cake however ron decided
// to blow only those candles whose number is divided by itself only.
// After blowing the candles find how many candles are still lit.

import java.util.Scanner;

public class BlowCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCandles = sc.nextInt();
        int remaining = blowCandles(totalCandles);
        System.out.println(remaining);
    }
    static int blowCandles(int total){
        int remaining = total;
        for (int i = 2; i <= total; i++) {
            if(isPrime(i)){
                remaining--;
            }
        }
        return remaining;
    }
    static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
