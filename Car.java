package mypack;   // Package name (folder inside src)

/*
 * Class Car demonstrates basic class structure:
 * - Variables (speed, model, type)
 * - Method (start)
 * - main method (program execution)
 */
public class Car {

    // -------------------------
    // Instance Variables
    // -------------------------
    int speed;         // stores car speed
    String model;      // stores car model name
    String type;       // stores car type (e.g., sedan, SUV)

    // -------------------------
    // Method Definition
    // -------------------------
    void start() {
        System.out.println("The Car moves in 120kmph");
    }

    // -------------------------
    // Main Method
    // Program Execution Starts Here
    // -------------------------
    public static void main(String[] args) {

        // Creating an object of Car class
        Car c = new Car();

        // Assigning values to the object variables
        c.speed = 120;
        c.model = "BMW";
        c.type = "Sedan";

        // printing variable values
        System.out.println("Speed: " + c.speed);
        System.out.println("Model: " + c.model);
        System.out.println("Type: " + c.type);

        // Calling the start method
        c.start();
    }
}