package com.rajul;

import java.util.Scanner;

public class RotatedByTwoPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int ans = isRotated(a, b);
        System.out.println(ans);
    }
    static int isRotated(String a, String b){
        String rotated = a.substring(2) + a.charAt(0) + a.charAt(1);
        if(rotated.equals(b)) return 1;
        else return 0;
    }
}
