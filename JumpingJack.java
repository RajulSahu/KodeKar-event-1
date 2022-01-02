package com.rajul;
import java.util.*;

public class JumpingJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean canJump = jumpJack(n);
        System.out.println(canJump);
    }
    static boolean jumpJack(int n){
        int leap = 0;
        int count = 1;
        while(leap <= n){

            leap += count;

            if(count <= 2) count++;

            if(leap == n){
                return true;
            }
        }
        return false;
    }
}
