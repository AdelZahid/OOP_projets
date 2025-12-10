/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecomerce;
import java.util.*;
/**
 *
 * @author adelz
 */
public class Ecomerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        Item[] I=new Item[n];  
        for(int i=0;i<n;i++)
        {
            double p=s.nextDouble();
            I[i]=new Item(p);
        }
        Cart C=new Cart(I);
        C.MM(I);
        
        
    }
    
}
