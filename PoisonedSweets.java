package com.rajul;

import java.util.Scanner;

public class PoisonedSweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prisoners = findPoisonedSweet(n);
        System.out.println(prisoners);
    }
    static int findPoisonedSweet(int n){
        return (int)(Math.ceil(Math.log(n)));
    }

}
