package com.walking.CounterAggregation;

public class Counter {

    public final String name;
    public int counter;
    public final String unitOfMeasurement;

    void displayInfo() {
        System.out.printf("Имя счетчика: %s \tСчетчик: %d\tЕдиницы измерения: %s\n", name, counter,unitOfMeasurement);
    }

    public Counter(String name, int counter, String unitOfMeasurement){
        this.name = name;
        this.counter = counter;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public int increase ( int value){
        counter += value;
        return counter;
    }

    public int decrease ( int value){
        counter -= value;
        return counter;
    }
}
