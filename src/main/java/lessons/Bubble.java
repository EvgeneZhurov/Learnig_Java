package lessons;

import javax.crypto.spec.PSource;
import java.util.*;

public class Bubble {
    public static void main(String[] args) {

        int x = 0;
 /*       try {
            x = 6 / 0;
        } catch (Exception ex) {
            System.out.println("Деление на ноль");
        }
 */
        try {
            System.out.println(division(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int division(int n) throws Exception {
        int x = 1;
 /*       try {
            if (n == 0) {
                throw new Exception;
            }
        } finally {

        }*/

        return x;
    }

}
