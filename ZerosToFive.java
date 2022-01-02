package com.rajul;
import java.util.Scanner;

public class ZerosToFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String ans = replaceZerosByFive(n);
        System.out.println(ans);
    }
    static String replaceZerosByFive(String num){
        String finalStr = "";
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '0'){
                finalStr += '5';
            }
            else{
                finalStr += num.charAt(i);
            }
        }
        return finalStr;
    }
}
