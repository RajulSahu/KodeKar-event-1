package com.rajul;
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().trim().split(" ");
        int n = sc.nextInt();
        ArrayList<Integer> ans = removeNumber(nums, n);
        for(int i: ans){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print(ans.size());
    }

    static ArrayList<Integer> removeNumber(String[] nums, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(String s: nums){
            int num = Integer.parseInt(s);
            if(num != n){
                res.add(num);
            }
        }
        return res;
    }
}
