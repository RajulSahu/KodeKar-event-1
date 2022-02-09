package com.rajul;
import java.util.*;

public class FindNumberOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char target = sc.nextLine().charAt(0);
        int count = countTargetInString(str, target);
        System.out.println(count);
    }

    static int countTargetInString(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) count++;
        }
        return count;
    }
}
