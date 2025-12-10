/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resultcount;

/**
 *
 * @author adelz
 */
 abstract class Student {
    private String name;
    private String dept;
    private int id;

    public Student(String name, String dept, int id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public void printinfo()
    {
        System.out.println("Student name: "+ getName());
        System.out.println("Student ID: "+ getID());
        System.out.println("Student depertment: "+ getDept());
        
    }
    abstract double calulateCGPA();
    static void Compare(Student s1,Student s2)
    {
        if(s1.calulateCGPA()>s2.calulateCGPA())
        {
            System.out.println("the student came first is:");
            s1.printinfo();
        }else{
            System.out.println("the student came first is:");
            s2.printinfo();
            
        }
    }
    
}
