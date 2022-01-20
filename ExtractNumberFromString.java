package com.rajul;

import java.util.*;

public class ExtractNumberFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = extractLargestNumber(s);
        System.out.println(ans);

    }
    static int extractLargestNumber(String s){
        String num = "";
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num += ch;
            }
            else if(!Character.isDigit(ch) && !num.isEmpty()){
                if(num.indexOf('9') == -1 && Integer.parseInt(num) > max){
                    max = Integer.parseInt(num);
                }
                num = "";
            }
        }
        if(num.indexOf('9') == -1 && Integer.parseInt(num) > max){
            max = Integer.parseInt(num);
        }
        return max;
    }
}
