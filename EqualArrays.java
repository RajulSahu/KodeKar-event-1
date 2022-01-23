package com.rajul;

import java.util.*;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums1 = sc.nextLine();
        String nums2 = sc.nextLine();
        ArrayList<String> a = new ArrayList<>(Arrays.asList(nums1.split(" ")));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(nums2.split(" ")));
        boolean ans = isEqual(a, b);
        System.out.println(ans?1:0);
    }

    private static boolean isEqual(ArrayList<String> a, ArrayList<String> b) {
        a.retainAll(b);
        return a.size() == b.size();
    }
}
