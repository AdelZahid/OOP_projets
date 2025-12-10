/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practice;

import static com.mycompany.practice.newpackage.greeting.massage;

/**
 *
 * @author adelz
 */
public class Practice {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        massage();
        Shape s1=new Shape("red",33,40.44);
        Shape s2=new Shape("green",44,45.55);
        System.out.println(Shape.number);
        Triangle t1= new Triangle(10,"semi");
        t1.area();
        System.out.println(t1.angle);
        fun();
        Practice obj=new Practice();
        obj.gret();
        obj.fun2();
        
    }
    static void fun()
    {
        Practice obj2=new Practice();
        obj2.fun2();
        System.out.println("fun called");
    }
    void fun2()
    {
        gret();
    }
    void gret()
    {
       // fun();
        System.out.println("fun2 called");
    }
}
   