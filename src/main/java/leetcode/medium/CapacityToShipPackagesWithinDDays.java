package leetcode.medium;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 1, 1};
        System.out.println(shipWithinDays(array, 1));

    }

    public static int shipWithinDays(int[] weights, int days) {

        int sum = 0;
        int maxbox = 0;
        for (int weight : weights) {
            sum += weight;
            if (maxbox < weight) {
                maxbox = weight;
            }
        }

        if (sum / days > maxbox) {
            maxbox = sum / days - 1;
        }
        for (int i = maxbox; i < sum + 1; i++) {
            if (isPossible(i, weights, days)) {
                return i;
            }
            if (isPossible((maxbox + sum + 1) / 2, weights, days)) {
                sum = (maxbox + sum + 1) / 2;
            } else {
                i = ((maxbox + sum + 1) / 2) + 1;
            }
        }
        return -1;
    }

    public static boolean isPossible(int minWeight, int[] weights, int days) {
        int counter = 0;
        int weight = 0;
        for (int i = 0; i < weights.length; i++) {
            if (minWeight - weight < weights[i]) {
                counter++;
                weight = weights[i];
            } else {
                weight += weights[i];
            }
        }
        return counter < days;
    }

}
