package com.rajul;

import java.util.*;

public class GuessTheCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        char ans = guess(s, n);
        System.out.println(ans);
    }
    static char guess(String s, int n){
        Set<String> allSubString = allSubstrings(s);
        ArrayList<String> unique = new ArrayList<>(allSubString);
        Collections.sort(unique);
        String combined = "";
        for(String str: unique){
            combined += str;
        }
        return combined.charAt(n-1);
    }
    static Set<String> allSubstrings(String s){
        Set<String> sub = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                sub.add(s.substring(i, j));
            }
        }
        return sub;
    }
}
