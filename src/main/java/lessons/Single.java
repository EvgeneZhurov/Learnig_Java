package lessons;

import java.util.Arrays;

public class Single {
    public static void main(String[] args) {
        int[] nums = new int[]{3,5,3,1,2,1,2};
        for (int i = 0; i<=nums.length-1;i++){
            int a= nums[i];
            for (int j=0; j<=nums.length-1;j++){
                if (j == nums.length-1){
                    System.out.println(a);
                    break;
                }
                if (i==j){
                    continue;
                }
                int b = nums[j];
                if (a == b) {
    //                System.out.println(nums[]);
                    break;
                }

            }
        }
    }
}
