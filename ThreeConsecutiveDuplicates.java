package com.rajul;

import java.util.Scanner;

public class ThreeConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = removeThreeConsecutiveDuplicates(s);
        System.out.println(ans);
    }
    static String removeThreeConsecutiveDuplicates(String s){
        String res = "";
        boolean condition = true;
        while(condition) {
            int i = 0;
            while (i < s.length()) {
                if (i < s.length() - 2 && s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
                    i = i + 3;
                } else {
                    res += s.charAt(i);
                    i = i + 1;
                }
            }
            if(s.equals(res)){
                condition = false;
            }
            else{
                s = res;
                res = "";
            }
        }
        return res;
    }
}
