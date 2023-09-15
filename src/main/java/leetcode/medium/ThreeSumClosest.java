package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] nums = new int[]{4,0,5,-5,3,3,0,-4,-5};
        System.out.println(threeSumClosest(nums, -2));
    }

    public static int threeSumClosest(int[] nums, int target) {

        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }

        Arrays.sort(nums);

        if (nums[0] >= target) {
            return nums[0] + nums[1] + nums[2];
        }
        if (nums[nums.length - 1] <= target) {
            return nums[nums.length - 3] + nums[nums.length - 2] + nums[nums.length - 1];
        }

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                num = i;
                break;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(nums[num]);
        if (num + 1 <= nums.length - 1) {
            result.add(nums[num + 1]);
            if (num + 2 <= nums.length - 1) {
                result.add(nums[num + 2]);
            }
        }

        if (num - 1 > -1) {
            result.add(nums[num - 1]);
            if (num - 2 > -1) {
                result.add(nums[num - 2]);
                if (num - 3 > -1) {
                    result.add(nums[num - 3]);
                }
            }
        }
        System.out.println(result);

        while (result.size() > 3) {
            for (int i = 0; i < result.size() - 1; i++) {
                if (Math.abs(target - result.get(i)) > Math.abs(target - result.get(i + 1))) {
                    Collections.swap(result, i, i + 1);
                }

            }
            result.remove(result.size() - 1);
        }

        return result.get(0) + result.get(1) + result.get(2);
    }
}
