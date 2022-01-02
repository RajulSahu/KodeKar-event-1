package com.rajul;

import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = reverseString(s);
        System.out.println(reversed);
    }
    static String reverseString(String s){
        String finalString = "";
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' || i == s.length()-1){
                if(i == s.length()-1){
                    finalString += reverseWord(s.substring(start, i+1));
                }
                else{
                    finalString += reverseWord(s.substring(start, i))  + " ";
                }
                start = i + 1;
            }
        }
        return finalString;
    }
    static String reverseWord(String s){
        String reversedWord = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reversedWord += s.charAt(i);
        }
        return reversedWord;
    }
}
