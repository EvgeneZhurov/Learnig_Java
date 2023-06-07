//https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/

package leetcode.easy;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 6, 10, 12, 6, 18};
        System.out.println(averageValue(array));
    }

    public static int averageValue(int[] nums) {
        int result = 0;
        int n = 0;
        for (int num : nums) {
            if (num % 6 != 0) continue;
                result = result + num;
                n++;
        }
        if (n != 0) {
            return result / n;
        }

        return result;
    }

}
