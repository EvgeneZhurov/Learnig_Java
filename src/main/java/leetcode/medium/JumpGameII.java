package leetcode.medium;

public class JumpGameII {
    public static void main(String[] args) {

        int[] array = new int[]{5, 0, 5, 2, 2, 0, 0};
        System.out.println(jump(array));
    }

    public static int jump(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int counter = 0;
        int step = 0;
        while (true) {
            if (step + nums[step] >= nums.length - 1) {
                counter++;
                return counter;
            } else {
                counter++;
                step = bestVal(step, nums);
            }
        }
    }

    //Поиск лучшего следующего значения.
    public static int bestVal(int num, int[] nums) {

        int result = 0;
        int maxVal = 0;
        for (int i = num + 1; i < num + nums[num]; i++) {
            if (nums[i] + i >= maxVal) {
                result = i;
                maxVal = nums[i] + i;
            }
        }
        return result;
    }


}
