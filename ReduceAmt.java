package com.rajul;

public class ReduceAmt {
    public static void main(String[] args) {
        int initialAmt = 37000;
        int days = 4;
        reduceAmt(initialAmt, days);
    }
    static void reduceAmt(int initialAmt, int days){
        while(days != 0){
            initialAmt -= 20;
            days--;
            System.out.print(initialAmt + " ");
        }
        System.out.print("\n" + initialAmt);
    }
}
