package Leetcode;

import java.util.Arrays;

public class LargestSubquence {
    public static int longestIncreasingSubsquence(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = 1; i < nums.length; i++){
            for( int k = 0; k < i; k++){
                if(nums[i] > nums[k]){
                    dp[i] = Math.max(dp[i], dp[k] + 1);
                }
            }
        }
        int maxLen = 0;
        for (int i = 0; i < dp.length; i++){
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
}
