/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankbalace;

/**
 *
 * @author adelz
 */
public class Deposit extends Thread {
    BankAccount B2;
    int am;
    int n;
    public Deposit(BankAccount B2,int am,int n) {
        this.B2=B2;
        this.am=am;
        this.n=n;
    }

    @Override
    public void run() {
        B2.deposit(am,n);
    }
    
    
}
