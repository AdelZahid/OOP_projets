/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online;

/**
 *
 * @author adelz
 */
public class Biriyani implements Seling{

    @Override
    public String arrangeIngrident() {
        return "Spice Meat Curd,Chili,ghee";
    }

    @Override
    public void prepareIngrident() {
        System.out.println("cprepareIngrident......");
    }

    @Override
    public void completPreparation() {
        System.out.println("completPreparation.........");
    }

    @Override
    public void assemblingItem(Preparation p) {
        System.out.println("we get "+ p.arrangeIngrident());
    }

    @Override
    public void cookItem() {
        System.out.println("Assembling Biriyani...");
    }

    @Override
    public void FinishCooking() {
        System.out.println("cooking Complete........");
            }

    @Override
    public int TotalPrice(int PS, int TS) {
        if(TS>=10)
        {
            return (int)(TS*PS*.9);
        }else
        {
            return (int)( TS*PS*.8);
        }
    }

    @Override
    public void Selldish() {
        System.out.println("tptal sold..");
    }
    
}
