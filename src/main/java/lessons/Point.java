package lessons;

public final class Point {

    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(double translate1, double translate2) {
        x = x + translate1;
        y = y + translate2;
        return this;
    }

    public Point scale(double scale) {
        x = x * scale;
        y = y * scale;
        return this;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point setX(double x) {
        this.x = x;
        return this;
    }

    public Point setY(double y) {
        this.y = y;
        return this;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 1);
        p.scale(2).translate(2.0, 2.0);
        System.out.println((p.getX()) + (p.getY()));
    }
}

