package com.rajul;
import java.util.Scanner;

public class ExtractMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = extractMaximum(s);
        System.out.println(ans);
    }
    static int extractMaximum(String str){
        int num = 0, max = 0;
        boolean containsDigit = false;
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i))){
                num = num * 10 + (str.charAt(i) - '0');
                containsDigit = true;
            }
            else
            {
                max = Math.max(max, num);
                num = 0;
            }
        }
        if(containsDigit) return max;
        else return -1;
    }
}
