/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author adelz
 */
public class Shape {
   String colour;
  int side;
  static int angle;
  double base; 
  static int number;
   Shape(String s, int n, double b) {
    this.colour = s;
    this.side = n;
    this.base = b;
    Shape.number+=1;
    Shape.angle=40;
  }
public void area()
     {
         System.out.println(2*base*side);
     }
}
