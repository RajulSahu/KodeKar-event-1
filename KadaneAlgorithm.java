package com.rajul;

import java.util.Scanner;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] nums = inp.split(" ");
        int maxSum = kadaneAlgo(nums);
        System.out.println(maxSum);
    }
    static int kadaneAlgo(String[] nums){
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += Integer.parseInt(nums[i]);
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
