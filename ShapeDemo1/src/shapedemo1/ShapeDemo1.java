/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo1;


public class ShapeDemo1 {

    public static void main(String[] args) {
         Circle1 c1=new Circle1(5.00);
          c1.setcoulur("Blue");
        System.out.println("colout is: "+ c1.getcolour());
         System.out.println("AREA is: "+ c1.Area());
    }
    
}
