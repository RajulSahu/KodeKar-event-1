package com.rajul;
import java.util.*;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        maxNumber(n);
    }
    static void maxNumber(int num){
        int index = 0;
        int[] arr = new int[Integer.toString(num).length()];
        while(num != 0){
            arr[index] = num % 10;
            num = num / 10;
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
