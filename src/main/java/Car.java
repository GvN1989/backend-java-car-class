public class Car {
    String brand;
    String carType;
    int yearOfBuild;
    String color;
    double engineCapacity;


    public Car (String brand, String carType, int yearOfBuild, String color, double engineCapacity) {
        this.brand = brand;
        this.carType = carType;
        this.yearOfBuild = yearOfBuild;
        this.color= color;
        this.engineCapacity = engineCapacity;
    }

    public void printCar(){
        System.out.println("Deze " + brand + " " + carType + " is " + color);
    }


}
