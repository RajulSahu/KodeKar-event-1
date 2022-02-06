package com.rajul;
import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> res = generateParentheses(n);
        for(String para: res){
            System.out.println(para);
        }
    }

    private static ArrayList<String> generateParentheses(int n) {
        ArrayList<String> prev = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();

        if(n == 1){
            prev.add("()");
            return prev;
        }
        prev.addAll(generateParentheses(n-1));
        for(String para: prev){
            res.add(addSeparate(para));
        }
        for(String para: prev){
            res.addAll(addPair(para));
        }
        return res;
    }
    static String addSeparate(String para){
        para = "(" + para + ")";
        return para;
    }
    static SortedSet<String> addPair(String para){
        SortedSet<String> set = new TreeSet<>();
        set.add(para + "()");
        set.add("()" + para);
        return set;
    }
}
