package com.rajul;
import java.util.Scanner;


public class MinimalMovesToFormAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = minimumMoves(s);
        System.out.println(ans);
    }
    static int minimumMoves(String s){
        int len = s.length();
        if(len == 1){
            return 1;
        }
        if (len % 2 == 0){
            if(s.substring(0,len/2).equals(s.substring(len/2))){
                return 1 + minimumMoves(s.substring(0,len/2));
            }
            else{
                return 1 + minimumMoves(s.substring(0,len-1));
            }
        }
        else{
            return 1 + minimumMoves(s.substring(0,len-1));
        }
    }
}
