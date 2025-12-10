/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapetest;

/**
 *
 * @author adelz
 */
import java.util.*;
public class ShapeTest {

    public static void main(String[] args) {
        ProduceShape3d p1= new ProduceShape3d();
        Scanner sc=new Scanner(System.in);
        double s=sc.nextDouble();
        double sA1=p1.createShape3D(s);
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double sA2=p1.createShape3D(r, h);
        double x,y,z;
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        double sA3=p1.createShape3D(x, y, z);
        System.out.println("Surface Area 1: " + sA1);
        System.out.println("Surface Area 2: " + sA2);
        System.out.println("Surface Area 3: " + sA3);
        
    }
}
