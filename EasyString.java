package com.rajul;
import java.util.*;


public class EasyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = easyString(s);
        System.out.println(ans);
    }
    static String easyString(String s) {
        s = s.toLowerCase();
        String ans = "";
        int count = 1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ch){
                count++;
            }
            else{
                ans += Integer.toString(count) + ch;
                ch = s.charAt(i);
                count = 1;
            }
        }
        ans += Integer.toString(count) + ch;
        return ans;
    }
}
