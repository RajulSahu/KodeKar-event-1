package com.rajul;
import java.util.*;

public class ReverseCharacterBridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = n; j >= i; j--) {
                System.out.print(ch);
                ch++;
            }

            for (int space = 2; space < 2*i-1  ; space++) {
                System.out.print(" ");
            }
            if(i == 1){
                ch -= 2;
                for (int j = n; j > i; j--) {
                    System.out.print(ch);
                    ch--;
                }
            }
            else{
                ch--;
                for (int j = n; j >= i; j--) {
                    System.out.print(ch);
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
