package leetcode;

public final class Car {

    private double amountOfGasolineInTank;    //Количество бензина в баке
    private int coordinateX;                  //Координана X
    private int mileage;                      //Пробег
    private final int fuelConsumption;        //Расход топлива
    private final int fullTank;               //Емкость бака

    public Car(int fuelConsumption, int fullTank) {
        this.amountOfGasolineInTank = 10;
        this.coordinateX = 0;
        this.mileage = 0;
        this.fuelConsumption = fuelConsumption;
        this.fullTank = fullTank;
    }

    public double getAmountOfGasolineInTank() {
        return this.amountOfGasolineInTank;
    }

    public int getMileage() {
        return mileage;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void addAmountOfGasolineInTank(int liters) throws ArithmeticException {
        if (liters < 0) {
            throw new ArithmeticException("Количество заправляемого топлива не может быть отрицательным!");
        }
        if (this.amountOfGasolineInTank + liters > this.fullTank) {
            throw new ArithmeticException("Бак будет переполнен");
        } else {
            this.amountOfGasolineInTank += liters;
        }
    }

    public void moveXMiles(int x) {
        if ((double) Math.abs(x) / fuelConsumption > amountOfGasolineInTank) {
            System.out.println("Требуется заправка, автомобиль не может проехать данное растояние.");
        } else {
            this.amountOfGasolineInTank -= (double) Math.abs(x) / fuelConsumption;
            this.coordinateX += x;
            this.mileage += Math.abs(x);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "amountOfGasolineInTank=" + amountOfGasolineInTank +
                ", coordinateX=" + coordinateX +
                ", mileage=" + mileage +
                ", fuelConsumption=" + fuelConsumption +
                ", fullTank=" + fullTank +
                '}';
    }
}
