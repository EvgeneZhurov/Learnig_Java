package lessons;

public class NimGame {
    public static void main(String[] args) {

        System.out.println(canWinNim(5));
    }

    public static boolean canWinNim(int n) {

        if (n < 4) {
            return true;
        }

        return (n % 4 != 0);
    }
}
