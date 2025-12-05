/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acfinding;

/**
 *
 * @author adelz
 */
public class WIndow extends AC {
    
    String name;
    String status;

    

    public WIndow(float coolingCapacity, float powerConsumption, int price, String name, String status) {
        super(coolingCapacity, powerConsumption, price);
        this.name = name;
        this.status = status;
    }

   

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("This AC is " + name);
        System.out.println("The status for this AC " + status);
    }
}
    

