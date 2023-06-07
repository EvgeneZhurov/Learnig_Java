package leetcode.medium;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public static void main(String[] args) {

        int[] players = new int[]{4,4,4};
        int[] trainers = new int[]{8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);
        int result = 0;
        int j = 0;
        for (int player : players) {
            while (player > trainers[j]) {
                j++;
                if (j >= trainers.length) {
                    break;
                }
            }
            j++;
            if (j >= trainers.length) {
                break;
            }
            result++;
        }

        return result;
    }
}
