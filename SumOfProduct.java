package com.rajul;
import java.util.*;


public class SumOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = getProduct(n);
        System.out.println(ans);
    }

    static int getProduct(int n) {
        int x, y;
        int sop = 0;
        for (int i = 1; i <= n; i++) {
            x = i;
            y = n / i;
            sop += x*y;
        }
        return sop;
    }
}
