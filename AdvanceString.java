package com.rajul;

import java.util.Locale;
import java.util.Scanner;

public class AdvanceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = advanceString(s);
        System.out.println(ans);
    }
    static String advanceString(String s){
        s = s.toLowerCase();
        String ans = "";
        char ch;
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                ans += s.charAt(i);
            }
            else if (i%2 == 0){
                if(s.charAt(i) > 97) ch = (char)(s.charAt(i) - 1);
                else ch = s.charAt(i);
                ans += ch;
            }
            else {
                if(s.charAt(i) < 122) ch = (char)(s.charAt(i) + 1);
                else ch = s.charAt(i);
                ans += ch;
            }
        }
        return ans;
    }
}
