//https://leetcode.com/problems/longest-subsequence-with-limited-sum/
// начало 05.11.2022 в 17-55

package Leetcode;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {

        int[] num = new int[]{2,3,4,5};
        int[] q = new int[]{1};
        System.out.println(Arrays.toString(answerQueries(num, q)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        for (int j = 0; j < queries.length; j++) {
            if (queries[j] >= nums[nums.length - 1]) {
                queries[j] = nums.length;
                continue;
            }
                if (queries[j] < nums[0]){
                    queries[j] = 0;
                    continue;
                }
            for (int i = 0; i < nums.length - 1; i++) {
                if (queries[j] > nums[i]) {
                    if (queries[j] < nums[i + 1]) {
                        queries[j] = i+1;
                        break;
                    }
                    continue;
                }
                queries[j] = i + 1;
                break;
            }
        }
        return queries;
    }

}
