package com.rajul;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = checkPalindrome(str);
        System.out.println(ans);
    }
    static int checkPalindrome(String str){
        int s = 0;
        int e = str.length() - 1;
        while (s < e){
            if(str.charAt(s) == str.charAt(e)){
                s++;
                e--;
            }
            else {
                return 0;
            }
        }
        return 1;
    }

}
