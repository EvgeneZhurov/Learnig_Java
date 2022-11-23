package com.walking.CounterAggregation;

public class Main {
    public static void main(String[] args) {

        Counter gasCounter = new Counter("Счетчик газа", 0, "метры кубические");
        Counter coldWaterCounter = new Counter("Счетчик холодной воды", 0, "метры кубические");
        Counter hotWaterCounter = new Counter("Счетчик горячей воды", 0, "метры кубические");
        Counter electricityWaterCounter = new Counter("Счетчик электроэнергии", 0, "кВт·ч");

        gasCounter.displayInfo();
    }

    private void printValues() {

    }
}

