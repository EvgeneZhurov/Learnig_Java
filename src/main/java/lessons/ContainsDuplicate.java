package lessons;

import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> array = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (array.contains(nums[i])) {
                return true;
            }
            array.add(nums[i]);
        }
        return false;
    }

}
