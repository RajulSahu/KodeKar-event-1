package com.rajul;
import java.util.*;

public class SharingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean ans = findCommon(a, b);
        System.out.println(ans? 1:0);
    }
    static boolean findCommon(String a, String b){
        ArrayList<String> subseqA = subsequences("", a);
        subseqA.remove(subseqA.size()-1);
        ArrayList<String> subseqB = subsequences("", b);
        subseqB.remove(subseqB.size()-1);
        subseqA.retainAll(subseqB);
        return (subseqA.size() != 0);

    }
    static ArrayList<String> subsequences(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(p);
            return lst;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequences(p+ch, up.substring(1));
        ArrayList<String> right =  subsequences(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
