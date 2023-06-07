package lessons;

import java.util.Arrays;

public class ShuffleЕheArray {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(array, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i];
            result[i*2+1] = nums[n+i];
        }

        return result;
    }
}
