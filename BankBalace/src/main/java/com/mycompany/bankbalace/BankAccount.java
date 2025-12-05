/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankbalace;

/**
 *
 * @author adelz
 */
public class BankAccount {
     private int balance;
     private boolean t;

    public BankAccount(int balance,boolean t) {
        this.balance = balance;
        this.t=t;
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
       while(t)
       {
            if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
            t=false;
        }
       }
    }

    // Synchronized method to deposit money
    public synchronized void deposit(int amount,int n) {
        int i=0;
       while(i<n)
       {
            balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
        i++;
       }
    }
}
