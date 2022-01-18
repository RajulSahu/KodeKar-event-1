package com.rajul;
import java.util.*;

public class GoodOrBadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = isGoodOrBad(s);
        System.out.println(ans);
    }
    static int isGoodOrBad(String s){
        int vowel = 0, consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))){
                consonant = 0;
                vowel++;

                if(vowel > 5) return 0;
            }
            else if(isConsonant(s.charAt(i))){
                vowel = 0;
                consonant++;
                if(consonant >= 3) return 0;
            }
        }
        return 1;
    }
    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    static boolean isConsonant(char ch){
        return !isVowel(ch);
    }
}
