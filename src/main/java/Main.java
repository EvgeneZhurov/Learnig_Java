public class Main {
    public static void main(String[] args) {

        Car toyotaLC200 = new Car();
        System.out.println();
        toyotaLC200.carInfo();
        toyotaLC200.setAmountOfGasolineInTank(100);
        toyotaLC200.setAmountOfGasolineInTank(50);
        toyotaLC200.carInfo();
        toyotaLC200.setCoordinateX(500);
        toyotaLC200.carInfo();
        toyotaLC200.setCoordinateX(-60);
        toyotaLC200.carInfo();
        System.out.println("Пробег: " + toyotaLC200.getMileage() + " км.");
    }
}
