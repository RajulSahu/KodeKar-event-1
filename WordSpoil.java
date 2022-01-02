package com.rajul;
import java.util.*;

public class WordSpoil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = countWords(s);
        System.out.println(ans);
    }
    static int countWords(String s){
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') spaces++;
            }
        return spaces+1;
        }
}
