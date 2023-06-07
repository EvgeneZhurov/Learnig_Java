package leetcode.medium;

public class NumberOfWaysToBuyPensAndPencils {
    public static void main(String[] args) {
        System.out.println(waysToBuyPensPencils(5, 10, 5));
    }

    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {

        if (total < Math.min(cost1, cost2)) {
            return 1;
        }
        long result = 0;
        for (int i = 0; i <= total / Math.max(cost1, cost2); i++) {
            int num = total - i * Math.max(cost1, cost2);
            result += num / Math.min(cost1, cost2) + 1;
        }
        return result;
    }
}
