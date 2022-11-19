import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

/*
        byte num1 = -128;
        short num2 = Short.MAX_VALUE;
        int num3 = Integer.MAX_VALUE;
        long num4 = Long.MAX_VALUE;
        boolean isTrue = false;
        char element ='a';
        float num5 = 1/3f;
        double num6 = 1/3d;
        num4++;
*/
/*

        List<Integer> array1 = new ArrayList();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(5);
        array1.add(4);
        //    System.out.println(Collections.unmodifiableList(array1));
        int a = array1.size();
        System.out.println(a + 1);
        System.out.println("Размер массива array1 :" + " " + a);
*/
        List<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        System.out.println(Collections.unmodifiableList(array));
    }
}