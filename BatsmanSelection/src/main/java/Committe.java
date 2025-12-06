/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adelz
 */
public class Committe {
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
