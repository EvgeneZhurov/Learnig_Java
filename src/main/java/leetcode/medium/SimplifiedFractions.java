package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SimplifiedFractions {
    public static void main(String[] args) {
        System.out.println(simplifiedFractions(15));
    }

    public static List<String> simplifiedFractions(int n) {

        List<String> result = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n; j++) {
                if (j >= i || isNod(i, j)) {
                    continue;
                }
                String a = j + "/" + i;
                result.add(a);
            }
        }
        return result;
    }

    public static boolean isNod(int a, int b) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                return true;
            }
        }
        return a > 1 && b > 1 && a % b == 0;
    }
}
