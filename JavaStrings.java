package com.rajul;

import java.util.*;

public class JavaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String ans = reverseAndConcatenate(s1, s2);
        System.out.println(ans);
    }
    static String reverseAndConcatenate(String s1, String s2){
        String ans = reverseString(s2) + reverseString(s1);
        return ans;
    }
    static String reverseString(String s){
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
