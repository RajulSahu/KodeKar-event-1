package com.rajul;

import java.util.*;

public class MagicalStringDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        generateMagicalString(s);
    }
    static void generateMagicalString(String s){
        s = s.toLowerCase();
        HashMap<Character, Character> map = new HashMap<>();
        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++){
            alpha[i] = (char)(97 + i);
        }
        int i = 0, j = 25;
        while(i < 26){
            map.put(alpha[i], alpha[j]);
            i++;
            j--;
        }
        for (int k = 0; k < s.length(); k++) {
            System.out.print(map.get(s.charAt(k)));
        }
    }
}
