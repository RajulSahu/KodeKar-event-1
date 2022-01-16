package com.rajul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        for (int i = 0; i < arr1.length; i++) {
            nums1.add(Integer.parseInt(arr1[i]));
        }
        for (int i = 0; i < arr2.length; i++) {
            nums2.add(Integer.parseInt(arr2[i]));
        }
        mergeSortedArrays(nums1, nums2);
    }
    static void mergeSortedArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2){
        int i = 0, j = 0;
        int k = 0;
        int[] res = new int[nums1.size() + nums2.size()];
        while(i < nums1.size() && j < nums2.size()){
            if(nums1.get(i) < nums2.get(j)){
                res[k] = nums1.get(i);
                i++;
            }
            else{
                res[k] = nums2.get(j);
                j++;
            }
            k++;
        }
        while(i < nums1.size()){
            res[k] = nums1.get(i);
            i++;
            k++;
        }
        while(j < nums2.size()){
            res[k] = nums2.get(j);
            j++;
            k++;
        }
        i = 0;
        int index = 0;
        while(i < nums1.size()){
            System.out.print(res[index] + " ");
            index++;
            i++;
        }
        i = 0;
        System.out.println();
        while(i < nums2.size()){
            System.out.print(res[index] + " ");
            index++;
            i++;
        }
    }
}
