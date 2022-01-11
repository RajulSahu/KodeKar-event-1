package com.rajul;
import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fizzBuzz(n);
    }
    static void fizzBuzz(int n){
        System.out.print("[");
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.printf("'%s'", "FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.printf("'%s'", "Fizz");
            }
            else if(i % 5 == 0){
                System.out.printf("'%s'", "Buzz");
            }
            else{
                System.out.printf("'%d'", i);
            }
            if(i<n)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
