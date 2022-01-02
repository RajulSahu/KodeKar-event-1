package com.rajul;

import java.util.Scanner;

public class IsPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        printPerfectSquare(limit);
    }
    static void printPerfectSquare(int limit){
        for (int i = 1; i <= limit ; i++) {
            if (isPerfectSquare(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPerfectSquare(int num){
        if(num == 1){
            return true;
        }
        for (int i = 1; i <= num / 2; i++) {
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
}
