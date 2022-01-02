package com.rajul;
import java.util.*;

public class SweepLineAlgo {
    public static void main(String[] args) {
        int[] timeIn = {1,2,3,4,5};
        int[] timeOut = {4,5,6,7,8};
        int ans = findMax(timeIn, timeOut);
        System.out.println(ans);
    }
    static int findMax(int[] timeIn, int[] timeOut){
        int[] temp = new int[timeIn.length + timeOut.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < timeIn.length && j < timeOut.length){
            if(timeIn[i] < timeOut[j]){
                temp[k] = 1;
                i++;
                k++;
            }
            else{
                temp[k] = -1;
                k++;
                j++;
            }
        }
        while(i < timeIn.length){
            temp[k] = 1;
            i++;
            k++;
        }
        while(j < timeOut.length){
            temp[k] = -1;
            j++;
            k++;
        }
        System.out.println(Arrays.toString(temp));
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int value : temp) {
            sum += value;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
