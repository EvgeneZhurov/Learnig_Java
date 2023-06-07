package lessons;

import java.util.Collection;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Car {

    // пример на моделях автомобилей
    private final CarBrand brand;
    private int age;
    private final String carModel;
    //  private String carNumber;;
    //  private String colour;
    //  private CarBodyStile body;
    //  private String VIN;
    //  private int mileage;
    //  private Boolean isUsed;
    //  private Cartransmission transmission;
    //  private EngineType engine;
    //  private Boolean isDamaged;

    public static void main(String[] args) {

        Car car1 = new Car(CarBrand.AUDI, 2022, "TT");
        Car car2 = new Car(CarBrand.BMW, 2021, "X3");
        Car car3 = new Car(CarBrand.VOLKSWAGEN, 2020, "Caddy");

        Car[] cars = new Car[]{car1, car2, car3};
        findCar(cars);
int[] array = new int[10];
    }

    // Мой первый конструктор
    Car(CarBrand brand, int age, String carModel) {
        this.brand = brand;
        this.age = age;
        this.carModel = carModel;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String setCarModel() {
        return carModel;
    }

    public static void displayInfo(Car car) {

        System.out.printf("Марка автомобиля: %s\tМодель: %s\tГод выпуска: %s\n", car.brand, car.carModel, car.age);
    }

    public static void findCar(Car[] cars) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        String brand = scanner.nextLine();
        System.out.print("Введите модель автомобиля: ");
        String carM = scanner.nextLine();
        System.out.print("Введите год выпуска: ");
        int age = scanner.nextInt();
        scanner.close();

   //     CarBrand carBrand = new CarBrand(scanner.nextLine());


        System.out.println(brand.length() == 0);
        System.out.println(carM);
        System.out.println(age);
    }

}


enum CarBrand {
    AUDI, FORD, CHEVROLET, TOYOTA, BMW, LEXUS, LADA, CITROEN, DAEWOO, GEELY, HAVAL, HONDA, HYUNDAY, INFINITY, JEEP, KIA, LANDROVER, MINI, MAZDA, MERCEDES, MITSUBISHI, NISSAN, OPEL, PEUGEOT, PORSCHE, RENAULT, SKODA, SUBARU, SUZUKI, VOLKSWAGEN, VOLVO
}

enum CarBodyStile {
    OFFROAD, SEDAN, HATCHBACK, MINIVAN, SUV, WAGON, COUPE
}

enum CarTransmission {
    MANUAL, AUTOMATIC, ROBOTIC, CVT
}

enum EngineType {
    PETROL, DIESEL, ELECTRIC
}

