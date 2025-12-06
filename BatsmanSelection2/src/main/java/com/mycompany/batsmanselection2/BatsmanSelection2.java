/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.batsmanselection2;

/**
 *
 * @author adelz
 */
import java.util.*;
class Batsman{
    private Integer totalRuns;
    private Integer totalOuts;
    Batsman(int TR,int TO)
    {
      this.totalRuns=TR;
      this.totalOuts=TO;
    }
    public Integer getTotalRuns(){
        return this.totalRuns;
    }
    public Integer getTotalOuts(){
        return this.totalOuts;
        }
        public void setTotalRuns(Integer TR){
            this.totalRuns=TR;
            }
            public void setTotalOuts(Integer TO){
                this.totalOuts=TO;
                }
}
class Committe{
    public Committe()
    {
    }
        public void calculateAverage(Batsman batsman) {
        double AR = (double) batsman.getTotalRuns() / batsman.getTotalOuts();
        System.out.println("Average of Batsman is: " + AR);
        if (AR >= 50) {
            System.out.println("Batsman selected");
        } else {
            System.out.println("Batsman not selected");
        }
    }
    }
public class BatsmanSelection2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TR=sc.nextInt();
        int TO=sc.nextInt();
        Batsman b1= new Batsman(TR,TO);
        Committe c1=new Committe();
        c1.calculateAverage(b1);

    }
}
