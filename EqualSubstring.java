package com.rajul;

import java.util.*;


public class EqualSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = countSubstrings(s);
        System.out.println(ans);
    }
    static int countSubstrings(String s){
        int[] freq = new int[3];
        int count = 0;
        ArrayList<String> allSubstrings = allSubstrings(s);
        for(String sub: allSubstrings){
            for (int i = 0; i < sub.length(); i++) {
                char ch = sub.charAt(i);
                freq[Integer.parseInt((ch+""))] += 1;
            }
            boolean isEqual = false;
            for (int i = 0; i < freq.length-1; i++) {
                if(freq[i] != freq[i+1]){
                    isEqual = false;
                    break;
                }
                else isEqual = true;
            }
            if(isEqual) count++;
            Arrays.fill(freq, 0);
        }
        return count;
    }
    static ArrayList<String> allSubstrings(String s){
        ArrayList<String> sub = new ArrayList<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                sub.add(s.substring(i, j));
            }
        }
        return sub;
    }

}
