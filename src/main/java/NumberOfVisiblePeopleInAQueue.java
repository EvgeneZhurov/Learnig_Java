import java.util.Arrays;

public class NumberOfVisiblePeopleInAQueue {
    public static void main(String[] args) {

        int[] array = new int[]{10,6,8,5,11,9};
        System.out.println(Arrays.toString(canSeePersonsCount(array)));
    }

    public static int[] canSeePersonsCount(int[] heights) {

        int counter;
        int height;

        for (int j = 0; j < heights.length - 2; j++) {
            if (heights[j] <= heights[j + 1]) {
                heights[j] = 1;
                continue;
            }
            counter = 1;
            height = heights[j];

            for (int i = j + 1; i < heights.length - 1; i++) {
                if (Math.min(heights[j],heights[i]) <= heights[j]) {
                    counter++;
                } else {break;}
            }
            heights[j] = counter;
        }

        heights[heights.length - 2] = 1;
        heights[heights.length - 1] = 0;

        return heights;
    }
}
