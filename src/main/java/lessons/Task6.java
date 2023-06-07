package lessons;

import java.awt.*;
import java.io.PrintStream;

public class Task6 {
    public static void main(String[] args) {
        String str = "abcdfegehaba";
        //создать массив из чисел вместобукв максимальной длинны
        int length = str.length();
        int[] massiv;
        massiv = new int[length]; // создаю массив и выделяю под него место из количества символов, для того чтобы вместо каждого символа вставлять число, соотвествующее длинне.
        for (int m = 0; m <= length - 1; m++) {
            massiv[m] = 0;
        }
        int k = 1; // k - с помощью этой переменной буду искать количество букв между выюранной буквой и попадающейся такой же.
        int begin = 0;
        String str1 = str;
        for (int i = 0; i <= (length - 1); i++) {
            str1 = str.substring(i);
            char namberI = str.charAt(i); // выбрали букву, например первую
            k=1;
            for (int j = (i + 1); j <= (length - 1); j++) {
                char namberJ = str.charAt(j);
                //  System.out.println(namberJ);
                k++; // посчитал количество букв между выбранной буквой и попадающейся такой же.
                if (namberI == namberJ) break;
            }
            int leightMaht = str1.length();
            str1 = str.substring(i, k);
            char namberK = str.charAt(leightMaht - 1-i);
            char namberOne = str.charAt(i);
            if (namberK == namberOne) {
                str1 = str1.substring(i, k - 1);
            }
            String str3 = str1;
            System.out.println(str);
            System.out.println(str1);

            // Следующая часть программы проверяет нет ли дублирующихся сиволов в получившейся последовательности. Хотелось бы научиться реализовывать проверку через отдельный класс, но пока будет так:


            int lengthStr1 = str1.length();
            int leightWithoutRepit = lengthStr1;
            namberOne = str1.charAt(0);
            char namberLast = str1.charAt(lengthStr1 - 1);
            int value = str1.length();
            boolean proverka = true;

            do {
                lengthStr1 = str1.length();
                //leightWithoutRepit = lengthStr1;
                //namberOne = str1.charAt(0);
                namberLast = str1.charAt(lengthStr1 - 1);
                str1 = str1.substring(0, lengthStr1 - 1);
                value = str1.indexOf(namberLast);
                if (value != -1) {
                    //  str1 = str1.substring(0,lengthStr1 - 2 );
                    proverka = false;
                    lengthStr1 = str1.length();
                    leightWithoutRepit = lengthStr1+i;
                }
            } while (lengthStr1 >= 2);
            if (proverka == true) {
                str1 = str3;
            } else {
                str1 = str.substring(i, leightWithoutRepit);
            }
            System.out.println(str1);
            massiv[i] = str1.length();
            System.out.println(massiv[i]);








         /*   for (int l = 0; l <= leightMaht - 1; l++) {
                leightMaht = str1.length();
                char namberMath = str1.charAt(l);
                String str2 = str1.substring(0, l) + str1.substring(l + 1);
                boolean proverka = true;
                int indexM = str2.indexOf(namberMath); // Ищем символ в строке
                if (indexM == -1) {
                    //    System.out.println("Символ не найден.");

                } else {
                    //     System.out.println("Символ найден, его индекс: " + indexM);
                    proverka = false;
                    k = k - 1;
                    str1 = str1.substring(0, k - 1);
                    l = 0;
                }
                if (proverka == true) {
                    massiv[i] = k-1;
                    //     System.out.println(massiv[i]);

                }
*/
            //  }

        }

    }
}
