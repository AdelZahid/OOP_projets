/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resultcount;

/**
 *
 * @author adelz
 */
public class CSEstudent extends Student {
    private double totalGrade;
    private double totalCredit;
    
 public CSEstudent(String name, String dept, int id,double Credit,double TGPA) {
        super(name, dept, id);
        this.totalCredit=Credit;
        this.totalGrade=TGPA;
    }
    public double getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(double totalGrade) {
        this.totalGrade = totalGrade;
    }

    public double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(double totalCredit) {
        this.totalCredit = totalCredit;
    }

   

    @Override
    double calulateCGPA() {
        
        return totalGrade/totalCredit;
        
    }
    
}
