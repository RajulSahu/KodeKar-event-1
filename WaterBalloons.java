package com.rajul;
import java.util.Scanner;

public class WaterBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = waterBalloons(s);
        System.out.println(ans);
    }
    static String waterBalloons(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++)
        {
            if(i < s.length()-2 && s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                continue;
            }
            else{
                res += s.charAt(i);
            }
        }
        return res;
    }
}
