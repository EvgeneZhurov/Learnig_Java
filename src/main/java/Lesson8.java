// Задача 2

public class Lesson8 {
    public static void main(String[] args) {

        byte num1 = 116;
        byte num2 = -122;
        byte num3 = 12;
        short num4 = 7777;
        short num5 = 5555;
        short num6 = 3000;
        int num7 = -1555555;
        int num8 = 666666666;
        int num9 = 666666666;
        long num10 = 666666666;
        long num11 = 666666666;
        long num12 = 666666666;

        System.out.println(summarizeNums(num1, num2, num3));
        System.out.println(summarizeNums(num4, num5, num6));
        System.out.println(summarizeNums(num7, num8, num9));
        System.out.println(summarizeNums(num10, num11, num12));
        System.out.println(summarizeNums(true, true, false));
        System.out.println(summarizeNums('A','B','C'));
    }

    static byte summarizeNums(byte... num) {
        byte result = 0;
        for (byte val : num) {
            if ((result + val) > Byte.MAX_VALUE || (result + val) < Byte.MIN_VALUE) {
                System.out.println("Превышение доспустимых значений byte");
                return result;
            }
            result += val;
        }
        return result;
    }

    static short summarizeNums(short... num) {
        short result = 0;
        for (short val : num) {
            if ((result + val) > Short.MAX_VALUE || (result + val) < Short.MIN_VALUE) {
                System.out.println("Превышение доспустимых значений short");
                return result;
            }
            result += val;
        }
        return result;
    }

    static int summarizeNums(int... num) {
        int result = 0;
        for (int val : num) {
            if (result > 0 && val > 0 && result + val < 0 || result < 0 && val < 0 && result + val > 0) {
                System.out.println("Превышение доспустимых значений int");
            }
            result += val;
        }
        return result;
    }

    static long summarizeNums(long... num) {
        long result = 0;
        for (long val : num) {
            result += val;
        }

        return result;
    }

    static boolean summarizeNums(boolean... num) {
        boolean result = true;
        for (boolean val : num) {
            result = result & val;
        }
        return result;
    }

    static String summarizeNums(char... num) {
        String result = "";
        for (char val : num) {
            result = result.concat(String.valueOf(val));
        }
        return result;
    }
}
