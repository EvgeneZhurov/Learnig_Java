package lessons;

public class Targer {
    public static void main(String[] args) {
        int terget = 8;
        int[] massive = new int[]{5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
        for (int i = 1; i <= (massive.length - 1); i++) {
            for (int j = 0; j <= i - 1; j++) {
                int a = massive[j] + massive[i];
                if (a == terget) {
                    System.out.print(j);
                    System.out.print(" ");
                    System.out.println(i);
                    i = massive.length;
                    break;
                }
            }
        }
    }
}

