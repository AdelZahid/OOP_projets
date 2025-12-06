/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.depertment;
import java.util.*;
/**
 *
 * @author adelz
 */
public class Employdata {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        Employee[] E= new Employee[n];
        Employee.setorg("AUST");
        for(int i=0;i<n;i++)
        {
            String name=s.nextLine();
            int id=s.nextInt();
            int age=s.nextInt();
            s.nextLine();
            String desi=s.nextLine();
            E[i] = new Employee(name, id, age, desi);
        }
        int ri=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(E[i].getid()==ri)
            {
                E[i].printinfo();
            }
                
        }
                
                
    }
}
