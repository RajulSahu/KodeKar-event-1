package com.rajul;
import java.util.*;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        inp =inp.trim();
        String[] nums = inp.split(" ");
        long[] reversed = reversedArray(nums);
        for(long i: reversed)
            System.out.print(i + " ");
    }
    static long[] reversedArray(String[] nums){
        long[] ans = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Long.parseLong(reverse(nums[i]));
        }
        return ans;
    }
    static String reverse(String s){
        String res = "";
        boolean isNegative = false;
        for(int i = s.length()-1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(ch != '-')
                res += ch;
            else{
                isNegative = true;
            }
        }
        if(isNegative) return "-" + res;
        else return res;
    }
}
