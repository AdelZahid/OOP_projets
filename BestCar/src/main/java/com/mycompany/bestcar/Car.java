/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bestcar;

/**
 *
 * @author adelz
 */
class Car extends Vehicle {
    private int engineCC;
    private int engineHP;
    private double fuelConsumption;
    private double maxSpeed;

    public Car(String make, String model, double price, int engineCC, int engineHP, double fuelConsumption, double maxSpeed) {
        super(make, model, price);
        this.engineCC = engineCC;
        this.engineHP = engineHP;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    // Setters and getters
    public void setEngineCC(int engineCC) { this.engineCC = engineCC; }
    public int getEngineCC()
    {
        return engineCC; 
    }

    public void setEngineHP(int engineHP)
    { 
        this.engineHP = engineHP;
    }
    public int getEngineHP()
    {
        return engineHP; 
    }

    public void setFuelConsumption(double fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption; 
    }
    public double getFuelConsumption()
    {
        return fuelConsumption; 
    }

    public void setMaxSpeed(double maxSpeed) 
    {
        this.maxSpeed = maxSpeed; 
    }
    public double getMaxSpeed()
    {
        return maxSpeed;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Make: " + getMake());
        System.out.println(", Model: " + getModel());
        System.out.println(", Price: " + getPrice() );
        System.out.println(", Engine CC: " + getEngineCC());
        System.out.println(", Engine HP: " + getEngineHP());
        System.out.println(", Fuel Consumption: " + getFuelConsumption() );
        System.out.println("l/100km, Max Speed: " + getMaxSpeed() + "km/h");
    }

    @Override
    public int score() {
        int score = 0;
        score += this.engineHP / 10;  
        score += this.maxSpeed / 20; 
        score -= this.price / 10000;  
        score -= this.fuelConsumption * 2; 
        return score;
    }
    public void fuleconsumtion()
    {
        System.out.println("fule reduce: "+fuelConsumption*3);
    }
}