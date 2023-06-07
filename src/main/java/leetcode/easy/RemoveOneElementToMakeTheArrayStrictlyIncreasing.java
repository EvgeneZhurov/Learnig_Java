package leetcode.easy;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,1};
        System.out.println(canBeIncreasing(array));
    }

    public static boolean canBeIncreasing(int[] nums) {

        boolean isTrue = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                if (!isTrue) {
                    return false;
                }
                if (i > 0 && nums[i - 1] >= nums[i + 1]) {
                    return false;
                } else {
                    if (nums[0] >= nums[2] ) {
                        return false;
                    }
                }
                isTrue = false;
            }
        }

        return true;
    }
}
