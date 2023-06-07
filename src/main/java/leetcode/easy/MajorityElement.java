package leetcode.easy;
import java.util.Arrays;



public class MajorityElement {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,3,5,5,5};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        /*
        List<Integer> array = new LinkedList<>();
        for (int num : nums) {
            array.add(num);
        }
        array.sort(Comparator.naturalOrder());
        return array.get(array.size()/2);*/


    }
}
