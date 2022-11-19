package Leetcode;//Задача https://leetcode.com/problems/plus-one/submissions/823890311/

public class Plusone {
    public static void main(String[] args) {
        int[] nums = new int[]{9, 9, 9, 9, 9};
        System.out.println(plusOne(nums));

    }

    public static int[] plusOne(int[] digits) {


        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
            if (i == 0 && digits[i] == 0) {
                int[] res1 = new int[digits.length + 1];
                res1[0] = 1;
                for (int j = 1; j <= digits.length; j++) {
                    res1[j] = 0;
                }
                for (int k = 0; k < res1.length; k++) {
                    System.out.print(res1[k]);
                }
                return res1;
            }
        }
        for (int k = 0; k < digits.length; k++) {
            System.out.print(digits[k]);
        }
        return digits;

    }


}
