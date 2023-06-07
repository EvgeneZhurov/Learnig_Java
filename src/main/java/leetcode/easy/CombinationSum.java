//https://leetcode.com/problems/combination-sum/
//Начало: 12-35 02.11.2022

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 6, 7};
    int target = 7;
        System.out.println(combinationSum(array,target));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
if (target%candidates[0] == 0){

}
        List<List<Integer>> result = new ArrayList<>();
        return result;
    }
}
