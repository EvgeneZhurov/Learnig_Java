//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
// начало 08.11.2022

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinarytToInteger {
    public static void main(String[] args) {
        List<Integer> head = new ArrayList<>();
        head.add(1);
        head.add(0);
        head.add(1);
        System.out.println(getDecimalValue((ListNode) head));
    }

    public static int getDecimalValue(ListNode head) {
        return 0;
    }
}
