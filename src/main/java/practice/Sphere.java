package practice;

public final class Sphere implements AreaMesurable {

    private final Point center;
    private final double radius;

    public Sphere(Point point, double radius) {
        this.center = point;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
}
