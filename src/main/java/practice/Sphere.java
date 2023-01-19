package practice;

public class Sphere implements AreaMesurable {

    private final Point point1;
    private final double radius;

    public Sphere(Point point, double radius) {
        this.point1 = point;
        this.radius = radius;
    }

    public Point getPoint1() {
        return point1;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
}
