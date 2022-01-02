package com.rajul;

public class NivenNumber {
    public static void main(String[] args) {
        int num = 42;
        boolean ans = checkNiven(num);
        System.out.println(ans);
    }
    static boolean checkNiven(int num){
        int temp = num;
        int sum = 0, d;
        while(num != 0){
            d = num % 10;
            sum += d;
            num = num / 10;
        }
        return temp % sum == 0;
    }
}
