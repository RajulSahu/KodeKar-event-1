package com.rajul;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = sortString(s);
        System.out.println(ans);
    }
    static String sortString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n-1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!isSwapped) break;
        }
        String ans = "";
        for (char ch: arr){
            ans += ch;
        }
        return ans;
    }
}
