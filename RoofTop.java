package com.rajul;
import java.util.*;

public class RoofTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int maxStep = calcMaxSteps(heights);
        System.out.println(maxStep);
    }
    static int calcMaxSteps(int[] heights){
        int count = 0;
        int maxStep = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length-1; i++) {
            if(heights[i+1] > heights[i]){
                count++;
            }
            else{
                if(count > maxStep){
                    maxStep = count;
                }
                count = 0;
            }
        }
        if(count > maxStep){
            maxStep = count;
        }
        return maxStep;
    }
}
