package com.rajul;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = removeExtraSpaces(s);
        System.out.println(ans);
    }
    static String removeExtraSpaces(String s){
        String ans = "";
        int foundSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && foundSpaces == 0){
                ans += s.charAt(i);
                foundSpaces++;
            }
            else if(s.charAt(i) != ' '){
                foundSpaces = 0;
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
