package com.rajul;
import java.util.*;

public class SetKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = setKthBit(n,k);
        System.out.println(ans);
    }
    static int setKthBit(int n, int k) {
        String bin = Integer.toBinaryString(n);
        String res = "";
        for (int i = 0; i < bin.length(); i++) {
            if(i == k-1) res += '1';
            else res += bin.charAt(i);
        }
        return Integer.parseInt(res,2);
    }
}
