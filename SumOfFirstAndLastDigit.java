package com.rajul;
import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = calculateSum(num);
        System.out.println(ans);
    }
    static int calculateSum(int num){
        int digits = (int)(Math.log10(num)) + 1;
        int first = (int)(num / Math.pow(10, digits-1));
        int last = num % 10;
        return first+last;
    }

}
