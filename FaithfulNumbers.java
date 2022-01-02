package com.rajul;
import java.util.*;


public class FaithfulNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findFaithFulNumber(n);
        System.out.println(ans);
    }
    static int findFaithFulNumber(int n) {
        String bin = Integer.toBinaryString(n);
        int pow = 0;
        int num = 0;
        for (int i = bin.length()-1; i >= 0 ; i--) {
            if(bin.charAt(i) == '1'){
                num += Math.pow(7, pow);
            }
            pow++;
        }
        return num;
    }
}
