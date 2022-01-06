package com.rajul;
import java.util.*;


public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans1 = removeDuplicates(s);
        String ans2 = removeDuplicatesUsingSet(s);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    // Without any DataStructure.
    static String removeDuplicates(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (!containsCharacter(ans, s.charAt(i))) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
    static boolean containsCharacter(String s, char ch){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

    // Using Linked Hash Set.
    static String removeDuplicatesUsingSet(String s){
        LinkedHashSet<Character> map = new LinkedHashSet<>();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            map.add(s.charAt(i));
        }
        for (char ch: map) {
            ans += ch;
        }
        return ans;
    }

}
