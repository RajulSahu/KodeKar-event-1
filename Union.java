package com.rajul;
import java.util.*;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums1 = sc.nextLine();
        String nums2 = sc.nextLine();
        String[] a = nums1.split(" ");
        String[] b = nums2.split(" ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Set<String> ans = calcUnion(a, b);
        for(String n: ans)
            System.out.print(n + " ");
    }
    static Set<String> calcUnion(String[] a, String[] b){
        Set<String> set = new HashSet<>(Arrays.asList(a));
        set.addAll(Arrays.asList(b));
        return set;
    }
}
