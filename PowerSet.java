package com.rajul;
import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> ans = generatePowerSet("", s, list);
        Collections.sort(ans);
        for(String str: ans){
            if(str != "") System.out.print(str + " ");
        }
    }
    static ArrayList<String> generatePowerSet(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        generatePowerSet(p+ch, up.substring(1), list);
        generatePowerSet(p, up.substring(1), list);
        return list;
    }
}
