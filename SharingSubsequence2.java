package com.rajul;

import java.util.*;


public class SharingSubsequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean ans = findCommon(a, b);
        System.out.println(ans? 1:0);
    }
    static boolean findCommon(String a, String b){
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, true);
            }else{
                map.put(ch, true);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(map.containsKey(b.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
