package com.rajul;
import java.util.*;

public class SwapUp {
    static String max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        max = s;
        findMaximum(s, n);
        System.out.println(max);
    }
    static void findMaximum(String s, int n){
        if(Integer.parseInt(s) > Integer.parseInt(max)){
            max = s;
        }
        if(n == 0){
            return;
        }
        for(int i = 0; i < s.length()-1; i++){
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(j) > s.charAt(i)){
                    String swapped = swap(s, i, j);
                    findMaximum(swapped, n-1);
                }
            }
        }
    }
    static String swap(String str, int i, int j){
        char ith = str.charAt(i);
        char jth = str.charAt(j);

        String left = str.substring(0, i);
        String middle = str.substring(i+1, j);
        String right = str.substring(j+1);

        return left + jth + middle + ith + right;
    }
}
