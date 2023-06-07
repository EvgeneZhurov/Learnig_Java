package lessons;

import java.util.*;

public class Lesson36 {
    public static void main(String[] args) {

        DoubleInt object1 = new DoubleInt(1, 2);
        DoubleInt object2 = new DoubleInt(2, 3);
        DoubleInt object3 = new DoubleInt(3, 4);
        DoubleInt object4 = new DoubleInt(4, 5);

        List<DoubleInt> list = new ArrayList<>();
        list.add(object4);
        list.add(object3);
        list.add(object2);
        list.add(object1);

       /* Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Integer[] array = new Integer[set.size()];
        set.toArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(set.iterator());*/
    }
}

class DoubleInt {
    private int a;
    private int b;

    DoubleInt(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
