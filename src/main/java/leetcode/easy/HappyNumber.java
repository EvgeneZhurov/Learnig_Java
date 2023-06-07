package leetcode.easy;

import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {

        List<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            if (isHappy(i)) {
                array1.add(i);
            }
        }

        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i)%11 ==0){
                System.out.println(array1.get(i));
            }
        }
        System.out.println(array1);
    }

    public static boolean isHappy(int n) {
        Set<Integer> array = new TreeSet<>();

        int num = 0;

        while (n != 1) {
            if (array.contains(n)) {
                return false;
            }
            array.add(n);
            String str = Integer.toString(n);

            for (int i = 0; i < str.length(); i++) {
                num = (int) (num + Math.pow(n % 10, 2));
                n = n / 10;
            }
            if (num == 1) return true;
            n = num;
            num = 0;
        }

        return true;
    }

}
