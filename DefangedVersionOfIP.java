package com.rajul;

import java.util.*;

public class DefangedVersionOfIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = defange(s);
        System.out.println(ans);
    }
    static String defange(String s){
        String ans = s.replace(".", "[.]");
        return ans;
    }
}
