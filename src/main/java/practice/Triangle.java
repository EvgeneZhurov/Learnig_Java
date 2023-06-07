package practice;

public final class Triangle implements AreaMesurable {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint1() {
        return point1;
    }

    @Override
    public double calcArea() {

        // Длины отверзков треугольника равны:
        double a = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
        double b = Math.sqrt(Math.pow(point2.getX() - point3.getX(), 2) + Math.pow(point2.getY() - point3.getY(), 2));
        double c = Math.sqrt(Math.pow(point3.getX() - point1.getX(), 2) + Math.pow(point3.getY() - point1.getY(), 2));
        double halfMeter = (a + b + c) / 2;

        // По формуле Герона площадь равна:
        return Math.sqrt(halfMeter * (halfMeter - a) * (halfMeter - b) * (halfMeter - c));
    }
}
