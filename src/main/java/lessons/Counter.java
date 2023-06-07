package lessons;

public class Counter {

    public static String name = "Counter";
    public int counter;

    public static void main(String[] args) {
        Counter evenCounter = new Counter("Четные числа");
        Counter oddCounter = new Counter("Нечетные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increment();
            } else {
                oddCounter.increment();
            }
        }

        printCounterValue(evenCounter);
        printCounterValue(oddCounter);

    }

    static void printCounterValue(Counter counter) {
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }

    public Counter(String name) {
        this(name, 0);
    }

    public Counter(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }
}

