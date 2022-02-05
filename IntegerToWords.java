package com.rajul;
import java.util.*;

public class IntegerToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = convertToWords(num);
        System.out.println(ans);

    }
    // Reference data to get words.
    static String[] ones = { "", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ",
            "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ",
            "nineteen " };
    static String[] tens = { "", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ",
            "ninety " };

    // Forms complete string of words and return number converted to a string.
    static String convertToWords(int num) {
        String res = "";
        res += numberTwoWord(num/10000000, "crore ");
        res += numberTwoWord((num/100000) %100, "lakh ");
        res += numberTwoWord((num/1000) %100, "thousand ");
        res += numberTwoWord((num/100) %10, "hundred ");

        if(num > 100 && num % 100 > 0){
            res += "and ";
        }

        res += numberTwoWord((num%100), "");

        return res;
    }
    // Converts one or two digit number to word.
    static String numberTwoWord(int n, String s){
        String str = "";
        if(n > 19){
            str += tens[n/10] + ones[n%10];
        }
        else{
            str += ones[n];
        }
        if(n != 0){
            str += s;
        }
        return str;
    }
}
