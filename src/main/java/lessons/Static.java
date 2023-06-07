package lessons;

public class Static {

    static int a;

    Static() {
        a = 5;
    }

    public static int getA() {
        return a;
    }

    public static void main(String[] args) {

        Static stat = new Static();

    }
}
