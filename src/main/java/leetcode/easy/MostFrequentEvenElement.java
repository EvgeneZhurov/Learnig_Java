//https://leetcode.com/problems/most-frequent-even-element/
//Начало 05.11.2022 11-25 решил за час

package leetcode.easy;
import java.util.*;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] num = new int[]{1,1,1};
        System.out.println(mostFrequentEven(num));
    }


    public static int mostFrequentEven(int[] nums) {
        if (nums.length == 1 && nums[0] % 2 == 0) return nums[0];

        Arrays.sort(nums);
        int maxVal = -1;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] >= nums[i + 1]) break;
            if (nums[i] % 2 == 0 && maxVal == -1) maxVal = nums[i];
            if (i == nums.length - 2) return maxVal;
        }
        Map<Integer, Integer> array = new TreeMap<>();
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 != 0) continue;
            if (array.get(num) == null) {
                array.put(num, 1);
                numbers.add(num);
                continue;
            }
            array.put(num, array.get(num) + 1);
        }
        if (array.size() == 0) return -1;
        maxVal = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(numbers.get(i)) > maxVal) {
                maxVal = array.get(numbers.get(i));
            }
        }
        List<Integer> num2 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(numbers.get(i)) == maxVal) {
                num2.add(numbers.get(i));
            }
        }
        return num2.get(0);
    }

}
