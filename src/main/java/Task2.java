        import java.util.Random;

        public class Task2 {
            public static void main(String[] args) throws IllegalAccessException {
                int a = 1110;
                int b = 10;
                System.out.println(randomEx(a, b));
            }

            public static Random geterator = new Random();
            public static int randomEx(int num1, int num2) throws IllegalAccessException {
                if (num1>num2) {
                    throw new IllegalAccessException( String.format("num1 must be less than num2", num1, num2));
                }
                return num1 + (int) (geterator.nextDouble() * (num2 -num1 + 1));
            }
        }

