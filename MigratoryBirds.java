package com.rajul;
import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int ans = migratoryBirds(nums);
        System.out.println(ans);
    }
    static int migratoryBirds(List<Integer> arr) {
        int[] freq = new int[6];
        for(int num: arr){
            freq[num]++;
        }
        int max = freq[1];
        int index = 1;
        for (int i = 2; i < freq.length; i++) {
            if(freq[i] > max){
                max = freq[i];
                index = i;
            }
        }
        return index;
    }
}
