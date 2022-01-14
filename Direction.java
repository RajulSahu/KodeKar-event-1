package com.rajul;

import java.util.*;

public class Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String dir = shortestPath(s);
        System.out.println(dir);
    }
    static String shortestPath(String s){
        String path;
        Stack<Character> EW = new Stack<>();
        Stack<Character> NS = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'E' || ch == 'W'){
                if(ch == 'E'){
                    if(!EW.isEmpty() && EW.peek() == 'W') EW.pop();
                    else EW.push(ch);
                }
                else {
                    if(!EW.isEmpty() && EW.peek() == 'E') EW.pop();
                    else EW.push(ch);
                }
            }
            else if(ch == 'N' || ch == 'S'){
                if(ch == 'N'){
                    if(!NS.isEmpty() && NS.peek() == 'S') NS.pop();
                    else NS.push(ch);
                }
                else {
                    if(!NS.isEmpty() && NS.peek() == 'N') NS.pop();
                    else NS.push(ch);
                }
            }
        }
        EW.addAll(NS);
        Collections.sort(EW);
        path = EW.toString();
        path = path.substring(1, path.length()-1).replace(", ", "");
        return path;
    }
}
