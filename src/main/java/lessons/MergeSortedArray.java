package lessons;//https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int[] array1 = {0};
        int[] array2 = {1};
        System.out.println(Arrays.toString(merge(array1, a, array2, b)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i=0;i<n;i++) {
                nums1[i] =nums2[i];
            }
        }
        if (n != 0 && m != 0) {

            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
            if (nums1[m - 1] > nums1[m]) {
                int element;
                for (int i = m; i < n + m; i++) {
                    for (int j = i; j > 0; j--) {
                        if (nums1[j] < nums1[j - 1]) {
                            element = nums1[j - 1];
                            nums1[j - 1] = nums1[j];
                            nums1[j] = element;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return nums1;
    }
}
