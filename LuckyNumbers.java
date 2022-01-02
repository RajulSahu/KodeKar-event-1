package com.rajul;
import java.util.*;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isLucky(n, 2);
        System.out.println(ans);
    }
    static boolean isLucky(int n, int counter){
        if(counter > n)
            return true;
        if(n % counter == 0)
            return false;
        n = n - (n/counter);
        return isLucky(n, ++counter);
    }
}
