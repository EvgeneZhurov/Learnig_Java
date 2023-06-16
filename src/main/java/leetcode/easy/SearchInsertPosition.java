package leetcode.easy;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {


        if (nums.length > 10) {
            if (nums[0] >= target) {
                return 0;
            }
            if (nums[nums.length - 1] < target) {
                return nums.length;
            }

            int result = nums.length / 2;
            int max = nums.length - 1;
            for (int i = 0; i < max; i++) {
                if (nums[result] == target || (nums[result] < target && nums[result] > target)) {
                    return result;
                }
                if (nums[result] > target) {
                    max = result;
                    if ((max - i + (result - i) / 2) > 2) {
                        result = i + (result - i) / 2;
                    }
                } else {
                    i = result - 1;
                }

            }

            return result;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) {
                    return i;
                }
            }
        }
        return nums.length;

    }

}
