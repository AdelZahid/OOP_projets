/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bestcar;

/**
 *
 * @author adelz
 */
abstract class Vehicle {
    protected String make;
    protected String model;
    protected double price;

    public Vehicle(String make, String model, double price) 
    {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    // Setters and getters
    public void setMake(String make) 
    {
        this.make = make;
    }
    public String getMake()
    {
        return make; 
    }

    public void setModel(String model) 
    { 
        this.model = model;
    }
    public String getModel()
    {
        return model; 
    }

    public void setPrice(double price)
    { 
        this.price = price; 
    }
    public double getPrice() 
    { 
        return price; 
    }

    public abstract void displayVehicleInfo();

    public abstract int score();
}
