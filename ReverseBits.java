package com.rajul;
import java.util.*;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverseBits(n);
        System.out.println(ans);
    }
    static int reverseBits(int n){
        String bin = Integer.toBinaryString(n);
        String reverseBin = "";
        for(int i = bin.length()-1; i >= 0 ; i--){
            reverseBin += bin.charAt(i);
        }
        return Integer.parseInt(reverseBin,2);
    }
}
