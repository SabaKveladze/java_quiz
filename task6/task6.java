import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Car {
    private static final Logger logger = LogManager.getLogger(Car.class);

    private String manufacturer;
    private int yearOfIssue;
    private String color;
    private int numberOfDoors;

 
    public Car() {}

    public Car(String manufacturer, int yearOfIssue, String color, int numberOfDoors) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String manufacturer, int yearOfIssue) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
    }

    public Car(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

   
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void printCarDetails() {
        logger.info("Manufacturer: " + manufacturer);
        logger.info("Year of Issue: " + yearOfIssue);
        logger.info("Color: " + color);
        logger.info("Number of Doors: " + numberOfDoors);
    }
}

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            // Task 4
            Car car1 = new Car();
            car1.setManufacturer("Toyota");
            car1.setYearOfIssue(2022);
            car1.setColor("Blue");
            car1.setNumberOfDoors(4);
            logger.info("Car 1 details:");
            car1.printCarDetails();

            // Task 6
            Car car2 = new Car("Honda", 2019, "Red", 2);
            logger.info("\nCar 2 details:");
            car2.printCarDetails();

            // Task 8
            Car car3 = new Car("Ford", 2015);
            car3.setColor("Black");
            car3.setNumberOfDoors(4);
            logger.info("\nCar 3 details:");
            car3.printCarDetails();

            // Task 10
            Car car4 = new Car("White", 4);
            car4.setManufacturer("BMW");
            car4.setYearOfIssue(2018);
            logger.info("\nCar 4 details:");
            car4.printCarDetails();

            // Task 12
            double exchangeRate = 2.65;

            // Task 14
            logger.info("\nConverting 1488 dollars to GEL:");
            logger.info(dollarToGEL(1488, exchangeRate));
        } catch (Exception e) {
            logger.error("An error occurred: " + e.getMessage());
        }
    }

    // Task 12
    static double dollarToGEL(double dollars, double exchangeRate) {
        return dollars * exchangeRate;
    }
}
