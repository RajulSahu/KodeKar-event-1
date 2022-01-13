package com.rajul;
import java.util.*;

public class WinnerOfElection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] votes = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < votes.length; i++) {
            votes[i] = sc.nextLine();
        }
        castVote(votes);
        }
    static void castVote(String[] votes){
        HashMap<String, Integer> map = new HashMap<>();
        for (String candidate: votes) {
            candidate = candidate.toLowerCase().trim();
            if (!map.containsKey(candidate)) {
                map.put(candidate, 1);
            } else {
                map.put(candidate, map.get(candidate) + 1);
            }
        }
        System.out.println(map);
        String winner = "";
        int max = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            int value = entry.getValue();
            String key = entry.getKey();
            if(value > max){
                max = value;
                winner = key;
            }
            else if(value == max && winner.compareTo(key) > 0){
                winner = key;
            }
        }
        winner += " " + max;
        System.out.println(winner);
    }
}
