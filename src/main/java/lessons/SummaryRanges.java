package lessons;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {

        int[] array = new int[]{};
        System.out.println(summaryRanges(array));
    }

    public static List<String> summaryRanges(int[] nums) {

        StringBuffer sb = new StringBuffer();

        List<String> result = new ArrayList<>();
        List<String> result1 = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        int lenhgt = 1;
        String str = String.valueOf(nums[0]);
        sb.append(nums[0]);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                lenhgt++;
                continue;
            }
            if (lenhgt == 1) {
                result.add(String.valueOf(nums[i]));
                result1.add(String.valueOf(nums[i]));
                str = String.valueOf(nums[i + 1]);
                sb.append(nums[i + 1]);
                continue;
            }
            str = str + "->" + String.valueOf(nums[i]);
            result.add(str);
            str = String.valueOf(nums[i + 1]);
            lenhgt = 1;

        }
        System.out.println(str);
        if (str.equals(String.valueOf(nums[nums.length - 1]))) {
            result.add(String.valueOf(nums[nums.length - 1]));
            return result;
        }
        str = str + "->" + String.valueOf(nums[nums.length - 1]);
        result.add(str);
        return result;
    }
}
