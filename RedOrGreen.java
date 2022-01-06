package com.rajul;

import java.util.Scanner;

public class RedOrGreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = makeIdentical(s);
        System.out.println(ans);
    }
    static int makeIdentical(String s){
        s = s.toUpperCase();
        int red = 0;
        int green = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R') red++;
            else green++;
        }
        return Math.min(red, green);
    }
}
