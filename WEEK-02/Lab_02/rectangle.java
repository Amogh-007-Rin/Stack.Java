// StudentName : Amogh Dath Kalasapura Arunkumar
// StudentId : 24168333
// StudentEmail : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

// importing all the libraries in java
import java.util.*;

// Creats a Rectangle class
public class Rectangle {
    Vector v1;
    Vector v2;

    // Creats a constructor 
    public Rectangle(Vector v1, Vector v2){
        this.v1 = v1;
        this.v2 = v2;
    }
    
    // Returns the width
    public double getWidth(){
        return Math.abs(this.v2.x - this.v1.x);
    }
    

    // Returns the height
    public double getHeight(){
        return Math.abs(this.v2.y - this.v1.y);
    }
    

    // Returns the Area
    public double getArea(){
        return Math.abs(this.getWidth() * this.getHeight());
    }
    

    // Returns the center
    public Vector getCenter(){
        double centerX = (this.v1.x + this.v2.x)/2;
        double centerY = (this.v1.y + this.v2.y)/2;
        return new Vector(centerX , centerY);

    }
    

    // Returns True if contains the the point vector else returns false
    public boolean contains(Vector point){
        return (point.x >= v1.x && point.x <= v2.x && point.y >= v1.y && point.y <= v2.y );
    }


    // Prints the values
    public void printRectangle(){
        
        this.v1.printVector("Vector 1");
        System.out.println();
        this.v2.printVector("Vector 2");
        System.out.println();
        System.out.println("Heigh of Rectangle :" + " " +getHeight());
        System.out.println("Width of the rectangle :" + " " + getWidth());
        System.out.println("Area of the rectangle :" + " " + getArea());
        System.out.println("Center of the rectangle :"+ " " + getCenter());
    }

    // Override method to convert ---> Rectangle@123883Ank to Rectangle [ v1(x,y) , v2(x,y) ] formate
    @Override
    public String toString() {
        return "Rectangle(v1: [" + v1.x + ", " + v1.y + "], v2: [" + v2.x + ", " + v2.y + "])";
    }


    public static void main(String args[]){
       // Executed tests and recorded the outputs in ShapesMain.java files
    }

}

