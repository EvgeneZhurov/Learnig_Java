package leetcode.medium;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
    public static void main(String[] args) {
        System.out.println(winnerOfGame("ABBBBBBBAAA"));
    }

    public static boolean winnerOfGame(String colors) {

        int numA = 0;
        int numB = 0;
        int counerA = 0;
        int counerB = 0;
        for (int i = 0; i < colors.length(); i++) {

            if (colors.charAt(i) == 'A') {
                if (counerB > 2) {
                    numB += counerB - 2;
                }
                counerB = 0;
                counerA++;
            }
            if (colors.charAt(i) == 'B') {
                if (counerA > 2) {
                    numA += counerA - 2;
                }
                counerA = 0;
                counerB++;
            }
        }

        if (counerB > 2) {
            numB += counerB - 2;
        }
        if (counerA > 2) {
            numA += counerA - 2;
        }
        System.out.println(numA);

        return numA > numB;
    }
}
