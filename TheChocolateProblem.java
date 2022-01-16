package com.rajul;

import java.util.Scanner;

public class TheChocolateProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = sc.nextInt();
        }
        int remaining = remainingChocolate(chocolates);
        System.out.println(remaining);
    }
    static int remainingChocolate(int[] chocolates){
        int len = chocolates.length;
        int start = 0;
        int end = len-1;
        while(start != end){
            if(chocolates[start] > chocolates[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return chocolates[start];
    }
}
