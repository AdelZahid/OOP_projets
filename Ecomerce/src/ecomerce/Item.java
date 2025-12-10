/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomerce;

/**
 *
 * @author adelz
 */
public class Item {
    private double price;
    Item()
    {
        
    }
    Item(double p)
    {
        this.price=p;
    }
    public void setprice(double p)
    {
        this.price=p;
    }
    public double getprice()
    {
        return this.price;
    }
            
}
