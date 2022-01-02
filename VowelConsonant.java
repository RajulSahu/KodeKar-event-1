package com.rajul;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        countVowelConsonants(s);
    }
    static void countVowelConsonants(String s) {
        int vowels = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels++;
            }
        }
        System.out.print(vowels + " " + (s.length() - vowels));
    }
}
