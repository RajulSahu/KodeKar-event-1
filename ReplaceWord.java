package com.rajul;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String ans = replaceWord(a,b,c);
        System.out.println(ans);
    }
    static String replaceWord(String a, String b, String c){
        return a.replaceAll(b, c);
    }
}
