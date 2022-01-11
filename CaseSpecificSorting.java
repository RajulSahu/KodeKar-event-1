package com.rajul;
import java.util.*;

public class CaseSpecificSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = sortCaseSpecific(s);
        System.out.println(ans);
    }

    static String sortCaseSpecific(String s) {
        int[] tell = new int[s.length()];
        String ans = "";
        int lowerIdx = 0;
        int upperIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                tell[i] = 1;
                lowerIdx++;
            } else {
                tell[i] = 0;
            }
        }
        char[] str = s.toCharArray();
        sortArray(str);
        for (int i = 0; i < tell.length; i++) {
            if(tell[i] == 0){
                ans += str[lowerIdx];
                lowerIdx++;
            }
            else{
                ans += str[upperIdx];
                upperIdx++;
            }
        }
        return ans;
    }

    static void sortArray(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
