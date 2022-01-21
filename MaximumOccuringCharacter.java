package com.rajul;
import java.util.*;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ans = findMaxOccurring(s);
        System.out.println(ans);
    }
    static char findMaxOccurring(String s) {
        int[] freq = new int[123];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > max){
                max = freq[i];
                index = i;
            }
        }
        return (char)(index);
    }
}
