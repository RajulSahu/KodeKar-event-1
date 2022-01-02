package com.rajul;

import java.util.Scanner;

public class IceCreamTreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        isPossible(money);
    }
    static void isPossible(int money){
        //1- Vanilla - 250rs
        //2- Chocolate - 320rs
        //3- Strawberry - 120rs
        int totalAmt = 690;
        if(money >= 690){
            int remainingAmt = money-totalAmt;
            System.out.print(1 + " " + remainingAmt);
        }
        else{
            System.out.print(0);
        }
    }
}
