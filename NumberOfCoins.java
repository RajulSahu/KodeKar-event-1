package com.rajul;
import java.util.*;

public class NumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[m];
        for (int i = 0; i < m; i++) {
         coins[i] = sc.nextInt();
        }
        // Simple Recursion call
        int ans1 = findMinCoins(value, coins);
        System.out.println(ans1);

        // DP with Recursion call
        int[] dp = new int[value+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int ans2 = findMinCoinsRecursionDP(value, coins, dp);
        System.out.println(ans2);

        // DP with Iteration call
        int ans3 = findMinCoinsIterationDP(value, coins);
        System.out.println(ans3);
    }

    // Simple Recursion
    static int findMinCoins(int target, int[] coins) {
        if(target == 0) return 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if(target - coins[i] >= 0) {
                int subAns = findMinCoins(target - coins[i], coins);
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return ans;
    }

    // DP with Recursion
    static int findMinCoinsRecursionDP(int value, int[] coins, int[] dp) {
        if(value == 0) return 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if(value - coins[i] >= 0) {
                int subAns = 0;
                if(dp[value] != -1){
                    subAns = dp[value - coins[i]];
                }
                else{
                    subAns = findMinCoins(value - coins[i], coins);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        dp[value] = ans;
        return ans;
    }

    // DP with Iteration
    static int findMinCoinsIterationDP(int value, int[] coins) {
        int[] dp = new int[value + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[value];
    }
}
