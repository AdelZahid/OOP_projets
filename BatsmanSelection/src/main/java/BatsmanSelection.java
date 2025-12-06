/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adelz
 */
import java.util.*;
public class BatsmanSelection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TR=sc.nextInt();
        int TO=sc.nextInt();
        Batsman b1= new Batsman(TR,TO);
        Committe c1=new Committe();
        c1.calculateAverage(b1);

    }
}