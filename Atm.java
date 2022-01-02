package com.rajul;
import java.util.*;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int want = sc.nextInt();
        double initBal = sc.nextDouble();
        double remainingAmt = transact(want, initBal);
        System.out.printf("%.2f%n", remainingAmt);
    }
    static double transact(int demand, double total){
        double remaining = total;
        if(demand % 5 == 0 && demand < total){
            remaining = total - (demand+0.5);
        }
        return remaining;
    }
}
