package leetcode.medium;

import java.util.*;

public class MinimumRoundsToCompleteAllTasks {
    public static void main(String[] args) {
        int[] array = new int[]{5, 5, 5, 5};
        System.out.println(minimumRounds(array));
    }

    public static int minimumRounds(int[] tasks) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int task : tasks) {
            if (mapa.get(task) == null) {
                mapa.put(task, 1);
                list.add(task);
            } else {
                mapa.put(task, mapa.get(task) + 1);
            }
        }

        int result = 0;
        for (Integer integer : list) {
            if (mapa.get(integer) == 1) {
                return -1;
            }
            if (mapa.get(integer) % 3 == 0) {
                result += mapa.get(integer) / 3;
            } else {
                result += (mapa.get(integer) / 3) + 1;
            }
        }
        return result;
    }
}
