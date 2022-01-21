package com.rajul;
import java.util.*;

public class LastMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String target = sc.nextLine();
        int ans = findCommon(s, target);
        System.out.println(ans);
    }
    static int findCommon(String s, String target){
        String sReversed = "";
        String targetReversed = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            sReversed += s.charAt(i);
        }
        for (int i = target.length()-1; i >= 0 ; i--) {
            targetReversed += target.charAt(i);
        }
        if(sReversed.indexOf(targetReversed) > 0){
            return 1 + s.length() - (sReversed.indexOf(targetReversed) + target.length());
        }
        else{
            return -1;
        }
    }
}

