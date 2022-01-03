package com.rajul;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = findLargest(num);
        System.out.println(ans);
    }
    static int findLargest(int num){
        int temp = num;
        while(num != 0){
            if(check(num))
                return temp;
            temp--;
            num--;
        }
        return 0;
    }
    static boolean check(int num){
        String n = num+"";
        char[] arr = n.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}
