package lessons.CounterAggregation;

public class Counter {

    private final String name;
    private int counter;
    private final String unitOfMeasurement;

    void displayInfo() {
        System.out.printf("Имя счетчика: %s \tСчетчик: %d\tЕдиницы измерения: %s\n", name, counter,unitOfMeasurement);
    }

    public Counter(String name, int counter, String unitOfMeasurement){
        this.name = name;
        this.counter = counter;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public int increase (int value){
        counter += value;
        return counter;
    }

    public int decrease ( int value){
        counter -= value;
        return counter;
    }
}
