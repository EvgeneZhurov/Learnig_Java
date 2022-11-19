//https://leetcode.com/problems/find-subarrays-with-equal-sum/
//Начало 05.11.2022 в 17-05 окончение 17-35

package Leetcode;

import java.util.*;


public class FindSubarraysWithEqualSum {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0};
        System.out.println(findSubarrays(nums));
    }

    public static boolean findSubarrays(int[] nums) {

        Map<Integer,Integer> array = new TreeMap();
        for (int i = 0; i < nums.length - 1; i++) {
            if (array.get(nums[i] + nums[i + 1]) != null) {
                return true;
            }
            array.put(nums[i] + nums[i + 1],1);
        }
        return false;
    }

}
