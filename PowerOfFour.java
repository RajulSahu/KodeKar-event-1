package com.rajul;

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPowerOfFour(num);
        System.out.println(ans?"YES":"NO");
    }
    static boolean isPowerOfFour(int num){
        double value, power = 1;
        while(power <= Math.ceil(Math.pow(num, 0.25))){
            value = Math.pow(4, power);
            if(num == value) return true;
            else power++;
        }
        return false;
    }
}
