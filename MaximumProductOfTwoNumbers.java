package com.rajul;

import java.util.*;

public class MaximumProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums= new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        for (int i = 0; i < arr.length; i++) {
            nums.add(Integer.parseInt(arr[i]));
        }
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
    static int maxProduct(ArrayList<Integer> nums){
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if(n > max){
                secondMax = max;
                max = n;
            }
            else if(n > secondMax){
                secondMax = n;
            }
        }
        return max*secondMax;
    }
}
