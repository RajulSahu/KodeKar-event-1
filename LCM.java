package com.rajul;

public class LCM {
    public static void main(String[] args) {
//        int a = 24;
//        int b = 36;
//        int ans = lcm(a,b);
//        System.out.println(ans);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int first = lcm(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            first = lcm(first, arr[i]);
        }
        System.out.println(first);
    }
    static int lcm(int a, int b){
        int i;
        for (i = Math.max(a, b); i <= a*b ; i+= Math.max(a, b)) {
            if(i % a == 0 && i % b == 0){
                break;
            }
        }
        return i;
    }
}
