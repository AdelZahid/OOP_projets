/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankdemo;

/**
 *
 * @author adelz
 */
public class BrackBank extends Bank {
    private double interest;

    
    public BrackBank(double interest,String Or) {
        super(Or);
        this.interest = interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }
    
}
