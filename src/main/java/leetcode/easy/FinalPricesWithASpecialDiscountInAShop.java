package leetcode.easy;

import java.util.Arrays;

public class FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {
        int[] prises = new int[]{8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(finalPrices(prises)));
    }

    public static int[] finalPrices(int[] prices) {

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] -= prices[j];
                    j=prices.length;
                }
            }
        }

        return prices;
    }
}
