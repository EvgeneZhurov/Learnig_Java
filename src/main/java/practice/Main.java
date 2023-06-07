package practice;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(1.0, 0.0);
        Point c = new Point(1.0, 8.0);

        Point z = a.setX(5);

        Sphere sphere1 = new Sphere(a, 2);
        Triangle triangle1 = new Triangle(a, b, c);

        AreaMesurable[] array1 = new AreaMesurable[2];
        array1[0] = sphere1;
        array1[1] = triangle1;

        System.out.println(calculateAverageArea(array1));

/*
        List<AreaMesurable> array = new ArrayList<>();
        array.add(sphere1);
        array.add(triangle1);

        System.out.println(calculateAverageArea(array));
*/
    }

    public static double calculateAverageArea(AreaMesurable[] array) {

        double result = 0;
        for (AreaMesurable areaMesurable : array) {
            result += areaMesurable.calcArea();
        }
        return result / array.length;
    }

    public static double calculateAverageArea(List<AreaMesurable> array) {

        double result = 0;
        for (AreaMesurable areaMesurable : array) {
            result += areaMesurable.calcArea();
        }
        return result / array.size();
    }

}
