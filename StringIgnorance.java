package com.rajul;
import java.util.*;

public class StringIgnorance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            ignoreAlternatingChar(s);
        }
    }
    static void ignoreAlternatingChar(String s){
        int[] occurrence = new int[123];
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            occurrence[ch]++;
            if(occurrence[ch] % 2 !=0){
                System.out.print(s.charAt(i));
            }
        }
    }
}
