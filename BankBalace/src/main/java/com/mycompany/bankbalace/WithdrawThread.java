/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankbalace;

/**
 *
 * @author adelz
 */
public class WithdrawThread extends Thread{
            BankAccount B1;
            int am;
    public WithdrawThread(BankAccount B1,int am) {
        this.B1=B1;
        this.am=am;
    }
            
    @Override
    public void run() {
        B1.withdraw(am);
    }
    
    
}
