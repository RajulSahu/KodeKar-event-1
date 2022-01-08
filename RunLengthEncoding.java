package com.rajul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = encodeRunningLength(s);
        System.out.println(ans);
    }
    static String encodeRunningLength(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(counter.containsKey(s.charAt(i))){
                counter.put(s.charAt(i), counter.get(s.charAt(i))+1);
            }
            else{
                counter.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: counter.entrySet()){
            ans += entry.getKey() + "" +entry.getValue();
        }
        return ans;
    }
}
