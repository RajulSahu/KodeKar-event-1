package com.rajul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums= new ArrayList<>();
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        for (int i = 0; i < arr.length; i++) {
            nums.add(Integer.parseInt(arr[i]));
        }
        ArrayList<Integer> leaders = findLeaders(nums);
        for(int leader: leaders){
            System.out.print(leader + " ");
        }
    }
    static ArrayList<Integer> findLeaders(ArrayList<Integer> nums){
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = nums.get(nums.size()-1);
        leaders.add(max);
        for (int i = nums.size()-2; i >= 0; i--) {
                if(nums.get(i) > max) {
                    max = nums.get(i);
                    leaders.add(max);
                }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
