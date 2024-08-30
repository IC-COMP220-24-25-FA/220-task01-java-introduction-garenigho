package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
         this.length = length;
         this.width = width;
    }

    public double calcArea(){
       return  length * width;
        
    }

    public void doubleSize(){
        this.length = this.length * 1.4142;
        this.width = this.width * 1.4142;
    }

    public double longestLineWithin(){
        return this.length; 
    }
    
}
