package com.rajul;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = rotateArray(nums, D);
        for(int n: ans)
            System.out.print(n + " ");
    }

    private static int[] rotateArray(int[] nums, int D) {
        if(D == nums.length) return nums;
        int[] res = new int[nums.length];
        int index = 0;
        for (int i = D; i < nums.length; i++) {
            res[index] = nums[i];
            index++;
        }
        for (int i = 0; i < D; i++) {
            res[index] = nums[i];
            index++;
        }
        return res;
    }
}
