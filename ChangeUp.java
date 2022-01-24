package com.rajul;
import java.util.*;


public class ChangeUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(a.split(" ")));
        swapAlternate(nums);
        for(String n: nums){
            System.out.print(n + " ");
        }
    }
    static void swapAlternate(ArrayList<String> nums) {
        for (int i = 0; i+2 < nums.size(); i++) {
            String temp = nums.get(i);
            nums.set(i, nums.get(i+2));
            nums.set(i+2, temp);
        }
    }
}
