/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo1;

/**
 *
 * @author adelz
 */
public class Circle1 {
    public  double radious;
    private   String colour;
    public Circle1( double r){
        this.radious=r;
    }
      public void setcoulur(String colour)
    {
        this.colour=colour;
    }
      public String getcolour()
      {
         return this.colour;
      }
      
    public double Area()
    { 
        return Math.PI*radious*radious;
    }
}
