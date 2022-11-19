//https://leetcode.com/problems/concatenation-of-array/
//05.11.2022 21-30 окончание 21-45

package Leetcode;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(array)));
    }

    public static int[] getConcatenation(int[] nums) {

       int[] result = new int[(nums.length) * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}
