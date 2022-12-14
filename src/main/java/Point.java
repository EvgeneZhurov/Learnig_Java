public final class Point {

    private double x;
    private double y;

     Point() {
        x = 0;
        y = 0;
    }

     Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double translate1, double translate2) {
        this.x = x + translate1;
        this.y = y + translate2;

    }

    public void scale(double scale) {
        this.x = x * scale;
        this.y = y * scale;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point p = new Point(1,1);
        p.scale(2);
        p.translate(2.0, 2.0);
        System.out.println((p.getX()) + (p.getY()));
    }
}

