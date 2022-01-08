package com.rajul;
import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = winner(s);
        System.out.println(ans);
    }
    static String winner(String choices){
        choices = choices.toUpperCase();
        char[] choice = choices.toCharArray();

        if(choice[0] == choice[1]) return "Draw";

        if(choice[0] == 'R'){
            if(choice[1] == 'S') return "A";
            if(choice[1] == 'P') return "B";
        }

        else if(choice[0] == 'P'){
            if(choice[1] == 'S') return "B";
            if(choice[1] == 'R') return "A";
        }

        else{
            if(choice[1] == 'P') return "A";
            if(choice[1] == 'R') return "B";
        }

        return "";
    }
}
