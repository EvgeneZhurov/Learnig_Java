package Leetcode;

import java.time.Duration;
import java.time.Instant;


public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arraay = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arraay));
    }

    public static int maxProfit(int[] prices) {


        Instant start = Instant.now();
        short result = 0;
        short minvalue = (short) prices[0];
        for (int i = 0; i < prices.length; i++) {
            minvalue = (short) Math.min(minvalue, prices[i]);
            result = (short) Math.max(result, prices[i] - minvalue);
        }
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println(elapsed);

        return result;
    }
}
