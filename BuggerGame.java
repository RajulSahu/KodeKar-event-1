package com.rajul;
import java.util.*;



public class BuggerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int times = buggerGame(num);
        System.out.println(times);
    }
    static int buggerGame(int num) {
        int times = 0;
        while(num / 10 != 0){
            int d, r = 1;
            int n = num;
            while(n != 0){
                d = n % 10;
                r *= d;
                n = n / 10;
            }
            num = r;
            times ++;
        }
        return times;
    }
}
