//https://leetcode.com/problems/permutations/

package Leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 5};
        System.out.println(permute(num));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length - 1;                               //длина массива
        int factorial = 1;                                          //колчиесвто вариантов - это length!
        for (int i = 1; i <= nums.length; i++) {
            factorial = factorial * i;
        }
        int[] numbers = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            numbers[i] = i + 1;
        }

        int check = (factorial / numbers.length) / (nums.length - 1);                                              //количество раз, которе встретится каждое число

        int[] array = new int[factorial / nums.length];
        for (int i = 0; i < factorial / nums.length; i++) {
            array[i] = i;
        }

        System.out.println(nums.length);
        System.out.println(check);
        System.out.println(Arrays.toString(numbers));
        System.out.println(factorial / nums.length);
        System.out.println(Arrays.toString(array));
        return result;
    }
}
