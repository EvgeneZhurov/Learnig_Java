//leetcode.com/problems/container-with-most-water/description/
package leetcode.easy;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] num = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(num));
    }

    public static int maxArea(int[] height) {
        int maxval = 0;
        int num1 = 0;
        int num2 = height.length;
        for (int j = 0; j < num2; j++) {
          if (height[j]< num1) continue;
            for (int i = j; i < height.length; i++) {
                if (maxval < (i-j) * Math.min(height[j], height[i])) {
                    maxval = (i-j) * Math.min(height[j], height[i]);
            num1 = Math.min(height[j], height[i]);
            num2 = i;
                }
            }
        }

        return maxval;
    }
}
