package com.rajul;
import java.util.*;

public class StringOfCommons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String ans = commonString(a, b);
        System.out.println(ans);
    }
    static String commonString(String a, String b){
        ArrayList<Character> first = new ArrayList<>();
        ArrayList<Character> second = new ArrayList<>();
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            first.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            second.add(b.charAt(i));
        }
        second.retainAll(first);
        if(second.size() > 0){
            for(char ch: second){
                res += ch;
            }
        }
        else{
            res = "nil";
        }
        return res;
    }
}
