package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(1.0, 0.0);
        Point c = new Point(1.0, 8.0);

        Sphere sphere1 = new Sphere(a, 2);
        Triangle triangle1 = new Triangle(a, b, c);

        List<AreaMesurable> array = new ArrayList<>();
        array.add(sphere1);
        array.add(triangle1);

        sumOfsquare(array);
    }

    public static void sumOfsquare(List<AreaMesurable> array) {

        double result = 0;
        for (AreaMesurable areaMesurable : array) {
            result += areaMesurable.area();
        }
        System.out.println(result/array.size());
    }

}
