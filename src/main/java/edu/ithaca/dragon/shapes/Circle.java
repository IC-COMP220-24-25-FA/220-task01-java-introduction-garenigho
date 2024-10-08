package edu.ithaca.dragon.shapes;

import javax.management.RuntimeErrorException;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return 1.4142 * radius * radius ; 

    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = this.radius * 1.4142 ; 
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return this.radius * 2 ; 
    }

    public static void main(string[] args){
        Circle x = new Circle(3) ;
         double y = x.calcArea(); 

}
