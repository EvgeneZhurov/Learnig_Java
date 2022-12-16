public final class Car {

    private double amountOfGasolineInTank;       //Количество бензина в баке
    private int coordinateX;                  //Координана X
    private int mileage;                      //Пробег
    private final int fuelConsumption;        //Расход топлива
    private final int fullTank;               //Емкость бака

    public Car(int fuelConsumption) {

        this.amountOfGasolineInTank = 10;
        this.coordinateX = 0;
        this.mileage = 0;
        this.fuelConsumption = fuelConsumption;
        this.fullTank = 100;
    }

    public void carInfo() {
        System.out.printf("Количество бензина в баке (литры): %.0f, Пробег (км): %d,Координана X: %d \n", amountOfGasolineInTank, mileage, coordinateX);
    }

    //Метод для передвижения на задланное количество километров
    public void moveXMiles(int x) {

        if (Math.abs(x) / fuelConsumption > (int) amountOfGasolineInTank) {
            System.out.println("Требуется заправка, автомобиль не может проехать данное растояние.");
        } else {
            this.amountOfGasolineInTank -= (double) Math.abs(x) / fuelConsumption;
            if (this.amountOfGasolineInTank < 5) {
                System.out.println("Требуется заправка, бак почти пуст");
            }
            this.coordinateX += x;
            this.mileage += Math.abs(x);
        }
    }

    //расстояние от начала координат
    public int getCoordinateX() {
        return this.coordinateX;
    }

    //Метод для заполнения топливного бака
    public void setAmountOfGasolineInTank(int liters) {

        if (this.amountOfGasolineInTank + liters > this.fullTank) {
            System.out.println("Бак будет переполнен! ");
        } else {
            this.amountOfGasolineInTank += liters;
        }
    }

    //Литров топлива в баке
    public double getAmountOfGasolineInTank() {
        return this.amountOfGasolineInTank;
    }

    public int getMileage() {
        return this.mileage;
    }
}
