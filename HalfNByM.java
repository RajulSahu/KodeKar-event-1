package com.rajul;

import java.util.Scanner;

public class HalfNByM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = nByM(N, M);
        System.out.println(ans);
    }
    static int nByM(int N, int M){
        while(M > 1){
            N = N / 2;
            M--;
        }
        return N;
    }
}
