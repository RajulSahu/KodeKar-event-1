package com.rajul;

import java.util.*;

public class PlayWithString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = manipulate(s);
        System.out.println(ans);
    }
    static String manipulate(String s){
        int sum = 0;
        String ans = "";
        ArrayList<Character> alpha = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                sum += Integer.parseInt(ch+"");
            }
            else{
                alpha.add(ch);
            }
        }
        Collections.sort(alpha);
        for(char a: alpha){
            ans += a;
        }
        ans += Integer.toString(sum);
        return ans;
    }
}
