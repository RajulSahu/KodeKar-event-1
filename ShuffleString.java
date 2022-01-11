package com.rajul;

import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int[] indexes = new int[len];
        for (int i = 0; i < len; i++) {
            indexes[i] = sc.nextInt();
        }
        char[] ans = suffleString(indexes, s);
        System.out.println(ans);
    }
    static char[] suffleString(int[] indexes, String s){
        char[] str = new char[indexes.length];
        for (int i = 0; i < indexes.length; i++) {
            str[indexes[i]] = s.charAt(i);
        }
        return str;
    }
}
