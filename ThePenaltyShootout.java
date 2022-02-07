package com.rajul;
import java.util.*;

public class ThePenaltyShootout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int goals = calcPenaltyGoals(s);
        System.out.println(goals);
    }
    static int calcPenaltyGoals(String s) {
        int goals = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == '2' && s.charAt(i+1) == '1'){
                goals++;
            }
        }
        return goals;
    }
}
