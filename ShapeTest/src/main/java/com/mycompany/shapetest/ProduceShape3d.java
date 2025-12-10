/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapetest;

/**
 *
 * @author adelz
 */
public class ProduceShape3d {
ProduceShape3d()
{
    
}
    Shape3d s3 = new Shape3d();

    public double createShape3D(double side) {
        double x = 6 * Math.pow(side, 2);
        s3.setarea(x);
        return s3.getarea();

    }

    public double createShape3D(double radius, double height) {
        double x2 = Math.PI * Math.pow(radius, 2) * height;
        s3.setarea(x2);
        return s3.getarea();
    }

    public double createShape3D(double x, double y, double z) {
        double x3 = 2 * x * y + 2 * y * z + 2 * z * x;
        s3.setarea(x3);
        return s3.getarea();
    }
}
