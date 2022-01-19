package com.rajul;
import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = maxSubLen(s);
        System.out.println(max);
    }
    static int maxSubLen(String s){
        int max = 0;
        boolean[] visited = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(visited[s.charAt(j)]){
                    break;
                }
                else {
                    max = Math.max(max, j-i+1);
                    visited[s.charAt(j)] = true;
                }
            }
            visited[s.charAt(i)] = false;
        }
        return max;
    }
}
