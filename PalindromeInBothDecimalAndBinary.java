package com.rajul;
import java.util.*;

public class PalindromeInBothDecimalAndBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPalindrome(num);
        System.out.println(ans? "Yes":"No");
    }
    static boolean isPalindrome(int num){
        return (isPalBinary(Integer.toBinaryString(num)) && isPalInteger(num));
    }
    static boolean isPalInteger(int num){
        String n = Integer.toString(num);
        int i = 0;
        int j = n.length()-1;
        while(i <= j){
            if(n.charAt(i) == n.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    static boolean isPalBinary(String bin){
        int i = 0;
        int j = bin.length()-1;
        while(i <= j){
            if(bin.charAt(i) == bin.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
