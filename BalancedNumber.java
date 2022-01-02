package com.rajul;
import java.util.*;

public class BalancedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int ans = isBalanced(n);
        System.out.println(ans);
    }
    static int isBalanced(String num){
        int len = num.length();

        int start = 0;
        int end = len-1;
        int mid = start + (end-start) / 2;

        int leftSum = calcDigitSum(Integer.parseInt(num.substring(0, mid)));
        int rightSum = calcDigitSum(Integer.parseInt(num.substring(mid+1, len)));

        return leftSum == rightSum ? 1 : 0;
    }
    static int calcDigitSum(int num){
        int d, res = 0;
        while(num != 0){
            d = num % 10;
            res += d;
            num = num / 10;
        }
        return res;
    }
}
