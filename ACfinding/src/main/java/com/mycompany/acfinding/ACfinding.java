/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.acfinding;
import java.util.*;
/**
 *
 * @author adelz
 */
public class ACfinding {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

       
        WIndow AC1 = new WIndow(200, 1000, 1000000, "WIndow", "THis is for little room");

        SplitAC AC2 = new SplitAC(250, 2543, 23500664, "Split", "THis is for big room");

        SmatrAC AC3 = new SmatrAC(300, 356, 103456456, "SmartAC", "THis has Smatr Feature");

        System.out.println("Input for inverter AC ");
        float cooling3 = sc.nextFloat();
        float power3 = sc.nextFloat();
        int price3 = sc.nextInt();
        String name3 = sc.nextLine();
        String status3 = sc.nextLine();
        sc.nextLine();
        InverterAC AC4 = new InverterAC(cooling3, power3, price3, name3, status3);
        
        ACcompare getAC = new ACcompare(AC1,AC2);
        AC bestAC = getAC.compare();

        System.out.println("The Best AC is:");
        bestAC.printInfo();
        
       

   }
}
