/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankbalace;
import java.util.*;

/**
 *
 * @author adelz
 */
public class BankBalace {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int deposit=sc.nextInt();
        int withdraw=sc.nextInt();
        int num=sc.nextInt();
         BankAccount account = new BankAccount(balance,true);

         Deposit D1= new Deposit(account,deposit,num);
         WithdrawThread W1= new WithdrawThread(account,withdraw);
         D1.start();
         W1.start();
    }
    }

