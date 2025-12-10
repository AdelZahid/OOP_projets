/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resultcount;

import static com.mycompany.resultcount.Student.Compare;

/**
 *
 * @author adelz
 */
public class Resultcount {

    public static void main(String[] args) {
        CSEstudent Cs1=new CSEstudent("Alamin","CSE",014,20,78.56);
        CSEstudent Cs2=new CSEstudent("Hadi","CSE",042,20,70.88);
        Student S1;
        S1=Cs1;
        Student S2;
        S2=Cs2;
        Compare(S1,S2);
    }
}
