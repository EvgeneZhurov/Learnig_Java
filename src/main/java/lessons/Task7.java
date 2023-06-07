package lessons;

//решение задачи с https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Task7 {
    public static void main(String[] args) {
        String str = "abbcdahbcbb";
        int lengthStr1 = str.length();
        int leightStr = str.length();
        String str1 = str;
        int[] massiv;
        massiv = new int[lengthStr1];
        for (int i = 0; i <= leightStr - 1; i++) {
            str1 = str.substring(i, str.length());
            String str2 = str1;
            lengthStr1 = str1.length();
            int leightWithoutRepit = lengthStr1;
            char namberOne = str1.charAt(0);
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
                    leightWithoutRepit = lengthStr1;
                }
            } while (lengthStr1 >= 2);
            if (proverka == true) {
                str1 = str2;
            } else {
                str1 = str.substring(i, leightWithoutRepit + i);
            }
            massiv[i] = str1.length();
        //    System.out.println(str1);
        //    System.out.println(massiv[i]);
        }
        int max = 0;// Посик максимального значения
        for (int x = 0; x <= (str.length() - 1); x++) {
         //   System.out.print(massiv[x] + " ");
            if (max <= massiv[x]) {
                max = massiv[x];
            }
        }
      //  System.out.println("Максимальное значение" + max);
        //Вывод результата
        for (int end =0; end <= (str.length() - 1);end++){
            if (max == massiv[end]){
                System.out.println(str.substring(end, end + max));
                break;
            }

        }
    }
}
