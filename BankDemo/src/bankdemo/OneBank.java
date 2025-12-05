/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankdemo;

/**
 *
 * @author adelz
 */
public class OneBank extends Bank {
    private double interest;

    public OneBank(double interest,String or) 
    {
        super(or);
        this.interest = interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }
    
}
