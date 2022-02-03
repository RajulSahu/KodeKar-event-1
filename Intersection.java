package com.rajul;
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num1 = sc.nextLine().trim().split(" ");
        String[] num2 = sc.nextLine().trim().split(" ");
        ArrayList<Integer> intersection = findIntersection(num1,num2);
        for(int i: intersection){
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> findIntersection(String[] num1, String[] num2) {
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        for(String s: num1){
            n1.add(Integer.parseInt(s));
        }
        for(String s: num2){
            n2.add(Integer.parseInt(s));
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(n1.size() < n2.size()) {
            for (int t : n1) {
                if (n2.contains(t)) {
                    list.add(t);
                }
            }
        }
        else{
            for (int t : n2) {
                if (n1.contains(t)) {
                    list.add(t);
                }
            }
        }
        return list;
    }
}
