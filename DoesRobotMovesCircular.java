package com.rajul;
import java.util.*;

public class DoesRobotMovesCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isPathCircular(s);
    }
    static void isPathCircular(String s){
        s = s.toUpperCase();
        int[] dir = new int[4];
        Arrays.fill(dir, 0);
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if(ch == 'G'){
                dir[i]++;
            }
            else if(ch == 'R'){
                i = (i+1)%4;
            }
            else if (ch == 'L') {
                i--;
                if(i < 0) i += 4;
            }
        }
        if(dir[0] == dir[2] && dir[1] == dir[3]){
            System.out.println("Circular");
        }
        else{
            System.out.println("Not Circular");
        }
    }
}
