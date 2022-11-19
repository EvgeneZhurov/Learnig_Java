//Задача https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {-11, 3, 4, 7, 8, 8, 9, 9, 9, 9, 12, 12, 13, 14, 14, 14, 14, 14};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i + 1);
                i = i - 1;
            }
        }
        int result = list.size();
        for (int i = 0; i < result; i++) {
            nums[i] = list.get(i);
        }

        return result;
    }
}

