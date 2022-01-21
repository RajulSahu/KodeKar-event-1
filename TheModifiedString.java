package com.rajul;
import java.util.*;

public class TheModifiedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = findMinOperations(s);
        System.out.println(ans);
    }
    static int findMinOperations(String s){
        int op = 0;
        char last = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(last == s.charAt(i)){
                count++;
                if(count >= 3){
                    op++;
                    count = 1;
                }
            }
            else{
                last = s.charAt(i);
                count = 1;
            }
        }
        return op;
    }
}
