package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// РОГРАММА РАБОТАЕТ НЕКОРРЕКТНО. Необходимо доделать случаи, когда массив array1 содержит метньшне элементов чем делители самого маленького числа в array2.
// Программа работала корректно, если убрать IF на 32 строке и удалить весь код после else 59 строки внутрии скобок!!!
// Что требуется доделать. Если массив array1 маленький, то просто перебором пробежаться по нему.

public class MinimumDeletionsToMakeArrayDivisible {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3, 3, 18, 3, 2, 3, 16};
        int[] array2 = new int[]{573595257, 616368999, 782586708, 555836748, 128826519, 10729950, 660848235, 459842193, 986538021, 509885907};
        System.out.println(minOperations(array1, array2));
    }

    public static int minOperations(int[] nums, int[] numsDivide) {

        Arrays.sort(nums);
        if (nums[0] == 1) {
            return 0;
        }
        int minnumsDivide = Collections.min(Arrays.stream(numsDivide).boxed().toList());
        List<Integer> arrayNumsDivide = new ArrayList<>();
        for (int i = minnumsDivide / 2 + 1; i > 1; i--) {
            if (minnumsDivide % i == 0) {
                arrayNumsDivide.add(minnumsDivide / i);
            }
        }
        arrayNumsDivide.add(minnumsDivide);
        if (arrayNumsDivide.size() < nums.length) {
            for (int i = 0; i < arrayNumsDivide.size(); i++) {
                for (int j = 0; j < numsDivide.length; j++) {
                    if (numsDivide[j] % arrayNumsDivide.get(i) != 0) {
                        arrayNumsDivide.remove(i);
                        i--;
                        if (arrayNumsDivide.size() == 0) {
                            return -1;
                        }
                        break;
                    }
                }
            }
            for (int i = 0; i < arrayNumsDivide.size(); i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (arrayNumsDivide.get(0) % nums[j] == 0) {
                        return j;
                    }
                    if (j == nums.length - 1) {
                        i--;
                        arrayNumsDivide.remove(0);
                        if (arrayNumsDivide.size() == 0) {
                            return -1;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < numsDivide.length; j++) {
                    if (numsDivide[j] % nums[i] == 0) {
                        return i;
                    }
                }
            }

        }
        return -1;
    }
}
