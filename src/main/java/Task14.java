import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        int number = 4;
        int[] marks = new int[number];
        marks[0] = 1;
        for (int i = 0; i <= (number - 1); i++) {
            if (marks[i] == 0) {
                break;
            }
            System.out.println(marks[0]);
        }
        for (int j = 1; j <= (number - 1); j++) {
            for (int i = 1; i <= (number - 1); i++) {
                if (marks[i] == 0) {
                    marks[i] = 1;
                    int k=i;
                    for (int s = 0; s <=k;s++) {
                        System.out.print(marks[i]);
                    }
                    break;
                } else {
                    marks[i] = marks[i] + marks[i - 1];
                }
                System.out.println(marks[i]);
            }
        }
    }

}
