package com.mycompany.bestcar;
import java.util.*;
/**
 *
 * @author adelz
 */
public class BestCar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cars to compare: ");
        int numberOfCars = scanner.nextInt();
        Car[] cars = new Car[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Make: ");
            String make = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Engine CC: ");
            int engineCC = scanner.nextInt();
            System.out.print("Engine HP: ");
            int engineHP = scanner.nextInt();
            System.out.print("Fuel Consumption (l/100km): ");
            double fuelConsumption = scanner.nextDouble();
            System.out.print("Max Speed (km/h): ");
            double maxSpeed = scanner.nextDouble();

            cars[i] = new Car(make, model, price, engineCC, engineHP, fuelConsumption, maxSpeed);
        }

        CarComparisonEngine engine = new CarComparisonEngine();
        Car bestCar = engine.compareCars(cars);

        System.out.println("The best car to buy is:");
        bestCar.displayVehicleInfo();
        bestCar.fuleconsumtion();
    }
}

