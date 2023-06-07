package leetcode.easy;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(threeConsecutiveOdds(array));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result = 0;
                continue;
            }
            result++;
            if (result > 2) {
                return true;
            }
        }
        return false;
    }
}
