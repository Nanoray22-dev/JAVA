package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

//1- write a program to find the larget subarray with equal number of 0s and 1s
public class FindArray {
    public int[] largestSubarrayWithEqualZeroOnes(int[] nums){
        HashMap <Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int endIndex = -1;
        int count = 0; 

        for(int i = 0; i < nums.length; i++){
            count += nums[i] == 1? 1: -1;
            if(count == 0){
                int len = i + 1;
                if(len > maxLen){
                    maxLen = len;
                    endIndex = i;
                }
            } else {
                if(map.containsKey(count)){
                    int len = i - map.get(count);
                    if(len > maxLen){
                        maxLen = len;
                        endIndex = i;
                    }
                } else {
                    map.put(count, i);
                }
            }
        }
        int startIndex = endIndex - maxLen + 1;

        return Arrays.copyOfRange(nums, startIndex, endIndex + 1);

    }
}


