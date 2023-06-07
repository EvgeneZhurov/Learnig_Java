package lessons;

public class Task12 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 2, 1};
        if (nums.length == 1) {
            System.out.println(nums[0]);
        } else {
            int j = 0;
            for (int i = 0; i <= (nums.length - 1); i++) {
                if (nums[i] == 0) {
                    j++;
                }
            }
            if (j == 1) {
                System.out.println(0);
            } else {
                for (int k = 0; k <= (nums.length - 1); k++) {
                    if (nums[k] == 0) {
                        continue;
                    }
                    for (int m = 0; m <= (nums.length - 1 - k); m++) {
                        if (nums[k] == nums[k + m + 1]) {
                            nums[k] = 0;
                            nums[k + m + 1] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
}