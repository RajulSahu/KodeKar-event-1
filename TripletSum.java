package com.rajul;
import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean contains = hasTripletSum(nums, target);
        System.out.println(contains?1:0);
    }
    static boolean hasTripletSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int start = i + 1;
            int end = nums.length-1;
            int twoSum = target - nums[i];
            while(start < end){
                int currSum = nums[start] + nums[end];
                if(currSum == twoSum){
                    return true;
                }
                if(currSum > twoSum){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return false;
    }
}
