package com.rajul;
import java.util.*;


public class TheWeddingDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        validDate(s);
    }
    static  void validDate(String s){
        String[] temp = s.split(" ");
        int date = Integer.parseInt(temp[0]);
        if(date <= 11){
            String t = temp[0];
            temp[0] = temp[1];
            temp[1] = t;
        }
        else{
            temp[0] = reversed(temp[0]);
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
    static String reversed(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}
