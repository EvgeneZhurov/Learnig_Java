public final class Point {

    private final double x;
    private final double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double scale) {
        return new Point(x * scale, y * scale);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 1).scale(2);
        System.out.println(p.getX() + " " + (p.getY()));
        System.out.println("Hello");
        System.out.println(p.getX() + " " + (p.getY()));
        System.out.println(p.getX() + " " + (p.getY()));
        System.out.println(p.getX() + " " + (p.getY()));
    }
}

