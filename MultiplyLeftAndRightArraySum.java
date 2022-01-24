package com.rajul;

import java.util.*;

public class MultiplyLeftAndRightArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(a.split(" ")));
        int ans = multiplyLeftAndRightArraySum(nums);
        System.out.println(ans);

    }
    static int multiplyLeftAndRightArraySum(ArrayList<String> nums) {
        int len = nums.size();
        int mid = len / 2;
        int leftSum = calcArraySum(nums, 0, mid);
        int rightSum = calcArraySum(nums, mid, len);
        return leftSum * rightSum;
    }
    static int calcArraySum(ArrayList<String> nums, int from, int to){
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += Integer.parseInt(nums.get(i));
        }
        return sum;
    }
}
