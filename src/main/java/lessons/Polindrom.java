package lessons;

public class Polindrom {
    public static void main(String[] args) {
        int a = 6678766;
        double b;
        int c;
        int length = String.valueOf(a).length();
        int[] massiv;
        massiv = new int[length];
        // Создаем массив и разиваем его на цифры из заданного числа
        for (int i = 0; i <= length - 1; i++) {
            b = Math.pow(10, length - 1 - i);
            ;
            c = (int) b;
            massiv[i] = a / c;

            a = a - massiv[i] * c;

        }
        boolean proverkaNaPolindrom = false;
        if (length % 2 == 0) {
            for (int j = 0; j <= (length / 2); j++) {
                if (massiv[j] != massiv[length - 1 - j]) {
                    break;
                } else {
                    if (length / 2 == j) {
                        proverkaNaPolindrom = true;
                    }
                }
            }
              System.out.println(proverkaNaPolindrom);
        } else {
            for (int j = 0; j <= ((length - 1) / 2); j++) {
                if (massiv[j] != massiv[length - 1 - j]) {
                    break;
                } else {
                    if ((length - 1) / 2 == j) {
                        proverkaNaPolindrom = true;
                    }
                }
            }
             System.out.println(proverkaNaPolindrom);
        }
    }
}

