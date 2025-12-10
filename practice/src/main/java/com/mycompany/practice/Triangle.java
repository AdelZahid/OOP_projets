/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author adelz
 */
class Triangle extends Shape {

    String name;
    int height;

    Triangle(int h, String s) {
        super(s,20, 10.0);
        this.height = h;
        this.name = s;
    }
}

