package com.rajul;
import java.util.*;

public class CamelCaseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = countCamelCase(s);
        System.out.println(ans);
    }
    static int countCamelCase(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i) <= 90) count++;
        }
        return count;
    }
}
