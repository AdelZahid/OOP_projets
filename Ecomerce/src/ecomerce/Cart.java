/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomerce;

/**
 *
 * @author adelz
 */
public class Cart {
    
    Cart()
    {
        
    }
    Cart(Item I[])
    {
        
    }
    public void MM(Item I[])
    {
        double totalprice=0;
        for (Item I1 : I) {
            totalprice += I1.getprice();
        }
        if(totalprice>500)
        {
            System.out.println("Too many");
        }
        else{
            System.out.println(totalprice);
        }
    }
    
}
