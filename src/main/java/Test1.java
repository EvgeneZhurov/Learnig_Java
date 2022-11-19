import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        System.out.println(collection.size());

        List<Integer> str = new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);
        str.add(2);
        str.add(11);

        str.set(2,10);
        System.out.println("Размер коллекции: " + str.size());
        System.out.println("Наполнение коллекции:" + " " + str);
        System.out.println("Первый элемент коллекции:" + " " + str.get(0));
        System.out.println("Последний элемент коллекции:" + " " + str.get(str.size()-1));


    }
}
