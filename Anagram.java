package com.rajul;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= testCase; i++){
            String s = sc.nextLine();
            int ans = findReplacement(s);
            System.out.println(ans);
        }
    }
    static int findReplacement(String s) {
        int len = s.length();
        if (len % 2 != 0) return -1;
        int mid = len / 2;
        int count = 0;
        int[] bucket = new int[26];
        char[] left = s.substring(0, mid).toCharArray();
        char[] right = s.substring(mid).toCharArray();
        for (int i = 0; i < left.length; i++) {
            bucket[left[i] - 'a']++;
        }
        for (int i = 0; i < right.length; i++) {
            if(bucket[right[i] - 'a'] > 0) bucket[right[i] - 'a']--;
        }
        for (int value: bucket){
            count += value;
        }
        return count;
    }
}
