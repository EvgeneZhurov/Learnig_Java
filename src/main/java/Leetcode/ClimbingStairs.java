package Leetcode;

import java.math.BigInteger;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 35;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int onestep;
        int twosteps;
        int result = 0;

        for (int i = 0; i <= n; i++) {
            onestep = i;
            if ((n - i) % 2 != 0) {
                continue;
            }
            twosteps = (n - i) / 2;

            BigInteger facrorialsumm = new BigInteger("1");
            BigInteger facrorial1 = new BigInteger("1");
            BigInteger facrorial2 = new BigInteger("1");
            for (int j = 1; j <= (onestep + twosteps); j++) {

                facrorialsumm.multiply(BigInteger.valueOf(j));
            }
            System.out.println();
      /*      for (int j = 1; j <= (onestep); j++) {
                BigInteger j1 = new BigInteger("j");
                facrorial1.multiply(j1);
            }
            System.out.println(facrorial1);
           for (int j=1;j<=(twosteps);j++){
                facrorial2 = facrorial2*j;
            }
            if (facrorial1 ==0 || facrorial2 == 0) {
                result=result+1;
                continue;
            }
         long num = facrorialsumm/(facrorial1*facrorial2);
            int num1 = (int) (num);
            result = result + num1;
        }
*/
        }
            return result;


    }
}
