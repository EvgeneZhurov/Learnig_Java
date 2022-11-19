package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] number = {0, 1, 0, 3, 12, 13, 0, 14, 0, 0, 0, 0, 0, 15, 0};

        System.out.println(Arrays.toString(MoveZ.moveZ(number)));
    }


    public class MoveZ {
        public static void main(String[] args) {
            int[] number = {0, 1, 0, 3, 12, 13, 0, 14, 0, 0, 0, 0, 0, 15, 0};

            System.out.println(Arrays.toString(moveZ(number)));
        }

        public static int[] moveZ(int[] nums) {
            if (nums.length < 2) {
                return nums;
            }
            List<Integer> num = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    num.add(nums[i]);
                    nums[i] = 0;
                }
            }
            for (int i = 0; i < num.size(); i++) {
                nums[i] = num.get(i);
            }
            return nums;
        }
    }


    /*public static int[] moveZ(int[] nums) {
        int zero;
        if (nums.length < 2) {
            return nums;
        }

        for (int i=0;i<nums.length;i++){
            zero=nums[i];
            if (zero !=0) {
                while (nums[])
            }


        }

        return nums;
    }  */
}

