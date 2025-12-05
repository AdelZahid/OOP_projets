/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acfinding;

/**
 *
 * @author adelz
 */
public class ACcompare {
    AC ac1;
    AC ac2;

    public ACcompare(AC ac1, AC ac2) {
        this.ac1 = ac1;
        this.ac2 = ac2;
    }
    
    public AC compare()
    {
        AC bestac=null ;
        if(ac1.score()>ac2.score())
    {
        bestac=ac1;
    }
        else{
            bestac=ac2;
        }
        return bestac;
    }
    
    
}
