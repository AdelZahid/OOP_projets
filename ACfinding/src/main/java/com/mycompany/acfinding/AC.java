/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acfinding;

/**
 *
 * @author adelz
 */
public class AC {
    float coolingCapacity;
    float powerConsumption;
    int price;

    public AC(float coolingCapacity, float powerConsumption, int price) {
        this.coolingCapacity = coolingCapacity;
        this.powerConsumption = powerConsumption;
        this.price = price;
    }
     public int score() {
        return (int) (coolingCapacity / 100 + powerConsumption / 100);
    }
    void printInfo() {
        System.out.println("Price: " + price);
        System.out.println("Cooling capacity: " + coolingCapacity);
        System.out.println("Power consumption: " + powerConsumption);
    }
}
