/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.depertment;

/**
 *
 * @author adelz
 */
public class Employee {
    public String name;
    private static String organization;
    private int id;
    private int age;
    private String designation;
   public Employee()
   {
       
   }
   public Employee(String n,int id,int age,String desi)
   {
       this.name=n;
       this.age=age;
       this.id=id;
       this.designation=desi;
   }
   public void setname(String n)
   {
       this.name=n;
   }
   public static void setorg(String org)
   {
       Employee.organization=org;
   }
   public void setid(int id)
   {
       this.id=id;
   }
   public void setage(int age)
   {
       this.age=age;
   }
   public void setdesi(String desi)
   {
       this.designation=desi;
   }
   public String getname()
   {
        return this.name;
   }
   public String getorg()
   {
       return Employee.organization;
   }
   public int getid()
   {
      return this.id;
   }
   public int getage()
   {
       return this.age;
   }
   public String getdesi()
   {
      return this.designation;
   }
   
   public void printinfo()
   {
       System.out.println("organization: "+getorg());
       System.out.println("name: "+getname());
       System.out.println("age: "+getage());
       System.out.println("id: "+getid());
       System.out.println("designation: "+getdesi());
       
       
       
   }
   
}
