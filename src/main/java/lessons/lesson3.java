package lessons;

public class lesson3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.jump();
    }

    static class Cat {
        String name;
        int age;

        void may() {
            System.out.println("мяу");
        }
        void jump() {
            System.out.println("прыг");
        }
    }
}
