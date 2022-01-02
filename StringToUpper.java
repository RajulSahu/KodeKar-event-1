package com.rajul;

public class StringToUpper {
    public static void main(String[] args) {
        String s = "HeLlO RajUL";
        String ans = transformString(s);
        System.out.println(ans);
    }
    static String transformString(String s){
        return s.toUpperCase();
    }

}
