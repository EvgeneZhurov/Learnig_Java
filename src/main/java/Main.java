public class Main {
    public static void main(String[] args) {

        Car toyotaLC200 = new Car(15);
        System.out.println();
        toyotaLC200.carInfo();
        toyotaLC200.setAmountOfGasolineInTank(100);
        toyotaLC200.setAmountOfGasolineInTank(50);
        toyotaLC200.carInfo();
        toyotaLC200.moveXMiles(500);
        toyotaLC200.carInfo();
        toyotaLC200.moveXMiles(-52);
        toyotaLC200.carInfo();
        System.out.println("Пробег: " + toyotaLC200.getMileage() + " км.");
        toyotaLC200.moveXMiles(-6000);
        toyotaLC200.carInfo();

    }
}
