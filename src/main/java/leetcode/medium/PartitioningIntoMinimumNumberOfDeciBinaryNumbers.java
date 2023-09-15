// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
//
package leetcode.medium;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        String a = "1233454756";
        System.out.println(minPartitions(a));

    }


    public static int minPartitions(String n) {
        int a = Integer.parseInt (n);
        int maxval=1;
        for (int i = 0; i < n.length(); i++) {

        }

    if (n.contains("9")) return 9;
    if (n.contains("8")) return 8;
    if (n.contains("7")) return 7;
    if (n.contains("6")) return 6;
    if (n.contains("5")) return 5;
    if (n.contains("4")) return 4;
    if (n.contains("3")) return 3;
    if (n.contains("2")) return 2;

        return 1;
    }

}
