package com.rajul;

import java.util.Scanner;

public class MinimumNumberToMakeSumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] nums = inp.split(" ");
        int n = minNumberToAdd(nums);
        System.out.println(n);
    }
    static int minNumberToAdd(String[] nums){
        int sum = 0;
        for(String n: nums){
            sum += Integer.parseInt(n);
        }
        if(sum % 2 == 0) return 2;
        else return 1;
    }
}
