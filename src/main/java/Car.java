public final class Car {

    private int amountOfGasolineInTank;       //Количество бензина в баке
    private int coordinateX;                  //Координана X
    private int mileage;                      //Пробег
    private final int fuelConsumption = 10;   //Расход топлива
    private final int fullTank = 100;         //Емкость бака

    public Car() {

        this.amountOfGasolineInTank = 10;
        this.coordinateX = 0;
        this.mileage = 0;
    }

    public void carInfo() {
        System.out.printf("Количество бензина в баке (литры): %d, Пробег (км): %d,Координана X: %d \n", amountOfGasolineInTank, mileage, coordinateX);
    }

    //Метод для передвижения на задланное количество километров
    public void setCoordinateX(int x) {

        if (x / fuelConsumption > amountOfGasolineInTank) {
            System.out.println("Требуется заправка, автомобиль не может проехать данное растояние.");
        } else {
            this.amountOfGasolineInTank -= Math.abs(x) / fuelConsumption;
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
    public int getAmountOfGasolineInTank() {
        return this.amountOfGasolineInTank;
    }

    public int getMileage() {
        return this.mileage;
    }
}
