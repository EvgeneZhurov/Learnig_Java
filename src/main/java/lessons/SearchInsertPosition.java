package lessons;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 5, 6};
        System.out.println(searchInsert(num, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int i = nums.length / 2;
        if (nums[i] == target) {
            return i;
        }
        return -1;
    }
}

