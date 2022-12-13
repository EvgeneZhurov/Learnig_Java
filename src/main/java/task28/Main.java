package task28;

public class Main {
    public static void main(String[] args) {

        Generic<Byte> generic = new Generic<>((byte) 15);
        System.out.println(generic.pow(2));
    }
}
