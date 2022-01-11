package com.rajul;
import java.util.*;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = sc.nextLine();
        String ans = removeChar(s, r);
        System.out.println(ans);
    }
    static String removeChar(String s, String r){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < r.length(); i++) {
            if(!map.containsKey(r.charAt(i))){
                map.put(r.charAt(i), 1);
            }
            else{
                map.put(r.charAt(i), map.get(r.charAt(i))+1);
            }
        }
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
