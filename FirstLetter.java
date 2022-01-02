package com.rajul;
import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = firstLetters(s);
        System.out.println(ans);
    }
    static String firstLetters(String s){
        String ans = "";
        ans += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                ans += s.charAt(i+1);
            }
        }
        return ans;
    }
}
