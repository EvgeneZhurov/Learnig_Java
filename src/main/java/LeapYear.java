public class LeapYear {
    public static void main(String[] args) {
        //Test
        // 4 - true
        // 21 - false
        // 88 - true
        // 200 - false

        int num = 200;

        System.out.println(isLeapYear(num));
    }

    public static boolean isLeapYear(int num) {
        return (num % 4 == 0) && (num % 100 != 0);
    }
}
