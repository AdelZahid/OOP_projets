/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acfinding;

/**
 *
 * @author adelz
 */
public class SplitAC extends AC implements SmartFeature {
     String name;
    String status;

    public SplitAC(float coolingCapacity, float powerConsumption, int price, String name, String status) {
        super(coolingCapacity, powerConsumption, price);
        this.name = name;
        this.status = status;
    }

     @Override
   public void tempControl() {
        System.out.println("The temperature is being controlled...");
    }

     @Override
    public void speedControl() {
        System.out.println("The speed is being controlled...");
    }

     @Override
    public void voiceControl() {
        System.out.println("This is voice controlled...");
    }


    void printInfo() {
        super.printInfo();
        System.out.println("This AC is " + name);
        System.out.println("The status for this AC " + status);
        this.speedControl();
        this.tempControl();
        this.voiceControl();
    }
}
