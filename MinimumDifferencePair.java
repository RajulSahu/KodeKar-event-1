package com.rajul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumDifferencePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums= new ArrayList<>();
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        for (int i = 0; i < arr.length; i++) {
            nums.add(Integer.parseInt(arr[i]));
        }
        int minDiff = calcMinDiff(nums);
        System.out.println(minDiff);
    }
    static int calcMinDiff(ArrayList<Integer> nums){
        Collections.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size()-1; i++) {
            int diff = Math.abs(nums.get(i) - nums.get(i+1));
            if(diff < min) min = diff;
        }
        return min;
    }
}
