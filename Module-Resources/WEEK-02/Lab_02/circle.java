// StudentName : Amogh Dath Kalasapura Arunkumar
// StudentId : 24168333
// StudentEmail : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

// importing all the libraries in java
import java.util.*;


// Creats a Circle Class
public class Circle {
    Vector center;
    double radius;

    // Creats a constructor
    public Circle(Vector center, double radius){
        this.center = center;
        this.radius = radius;
    }
    
    // Returns the diameter of the circle
    public double getDiameter(){
        return Math.abs(2*this.radius);
    }
    
    // Returns the area of the circle
    public double getArea(){
        return Math.PI * Math.pow(this.radius , 2);
    }
    
    // Returns true or false based on the condition
    public boolean contains(Vector point){
        Vector offSet = point.subtract(this.center);
        return (offSet.length() <= this.radius);
    }
    
    // boundingBox function
    public Rectangle boundingBox(){
        double cx = this.center.x;
        double cy = this.center.y;
        Vector p1 = new Vector(cx - this.radius , cy - this.radius);
        Vector p2 = new Vector(cx + this.radius , cy + this.radius);
        return new Rectangle(p1,p2);
    }

    // Override method to convert ---> Circle@123883Ank to Circle[ center(x,y), radius ] formate
    @Override
    public String toString() {
    return "Circle(center: [" + center.x + ", " + center.y + "], radius: " + radius + ")";
    }
    public static void main(String args[]){
       // Executed tests and recorded the outputs in ShapesMain.java files
    }
    }