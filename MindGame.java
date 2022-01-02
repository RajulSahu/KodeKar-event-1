package com.rajul;
import java.util.*;

public class MindGame {
    public static void main(String[] args) {
//      Formula to find the random number between min and max :-
//      Math.random() * (max - min + 1) + min
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans = generateOutput(k);
        System.out.println(ans);
    }
    static int generateOutput(int k) {
        int num = (int)(Math.random() * (10 - 1 + 1) + 1);
        int temp = num;
        num = num * 2;
        num = num + k;
        num = num / 2;
        num = num - temp;
        return num;
    }
}
