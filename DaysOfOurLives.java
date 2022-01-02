package com.rajul;
import java.util.Scanner;

public class DaysOfOurLives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int startDay = sc.nextInt();
        int[] ans = daysOfWeeks(days, startDay);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if(i < 6) System.out.print(" ");
        }
    }
    static int[] printNumberOfDays(int days, int startDay){
        int completeWeeks = days / 7;
        int remainingDays = days % 7;
        int[] ans = new int[7];
        if(days == 0) return ans;
        for (int i = 0; i <7; i++) {
            ans[i] = completeWeeks;
        }
        startDay -= 1;
        while(remainingDays >0){
            if(startDay > 7){
                startDay = 0;
            }
            ans[startDay] += 1;
            startDay++;
            remainingDays--;
        }
        return ans;
    }
    static int[] daysOfWeeks(int days , int startDay) {
        int remainingDays = days % 7;
        int completeWeeks = days / 7;
        int[] ans = new int[7];
        for(int i=0; i<7; i++){
            ans[i] = completeWeeks;
        }
        startDay=startDay-1;
        while(remainingDays>0){
            if(startDay>6)
                startDay=0;
            ans[startDay]=ans[startDay]+1;
            startDay++;
            remainingDays--;
        }
        return ans;
    }
}
