package com.rajul;
import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int ans = isIsomorphic(a, b);
        System.out.println(ans);
    }
    static int isIsomorphic(String a, String b){
        if(a.length() != b.length()) return 0;
        int[] first = new int[26];
        int[] second = new int[26];
        for (int i = 0; i < a.length(); i++) {
            first[a.charAt(i)-97] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            second[b.charAt(i)-97] += 1;
        }
        Arrays.sort(first);
        Arrays.sort(second);
        for (int i = 25; i >= 26-a.length(); i--) {
            if(first[i] != second[i]) return 0;
        }
        return 1;
    }
}
