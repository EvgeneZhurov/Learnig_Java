package leetcode.medium;

import java.util.Arrays;

public class DividePlayersIntoTeamsOfEqualSkill {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,1,3};
        System.out.println(dividePlayers(array));
    }

    public static long dividePlayers(int[] skill) {

        if (skill.length == 2) {
            return (long) skill[0] * skill[1];
        }
        double averageNum1 = 0;

        for (int j : skill) {
            averageNum1 += j;

        }
        averageNum1 /= skill.length;


        Arrays.sort(skill);
        long result = 0;
        for (int i = 0; i < skill.length / 2; i++) {
            if (skill[i] + skill[skill.length - 1 - i] != averageNum1 * 2) {
                return -1;
            }
            result += ((long) skill[i] * skill[skill.length - 1 - i]);
        }
        return result;
    }
}
