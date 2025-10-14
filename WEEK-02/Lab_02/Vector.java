// StudentName : Amogh Dath Kalasapura Arunkumar
// StudentId : 24168333
// StudentEmail : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

// importing all the libraries in java
import java.util.*; 

// Creating a public Vector Class
public class Vector {
    public double x, y;
    

    // Creating a Constructor
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Gets the value of x-vector-coordinate
    public double getX() {
    return x;
    }
    
    // Gets the value of y-vector-coordinate
    public double getY() {
    return y;
    }

    // Creats a Scale function which return a new vector by multiplying a vector with a input factor
    public Vector scale(double factor) {
        return new Vector(this.x * factor, this.y * factor);
    }


    // Creats a substract function which returns a new vector by subtracting two vectors
    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }
    
    // Creats a length function which returns the magnitude of length of a vector
    public double length() {
        return Math.sqrt(x * x + y * y);
    }


    // Creats a add function which returns a new vector by adding two vectors
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }
    
    // PrintVector function prints the values 
    public void printVector(String lable) {
        System.out.println(lable + " " + "x:" + x + ", y: " + y);
        System.out.println("Vector length: " + length());
    }
    

    // Override method to convert ---> Vector@123883Ank to Vector(x,y) formate
    
    @Override
    public String toString() {
    return "Vector(x: " + getX() + ", y: " + getY() + ")";
    }
    public static void main(String[] args) {
        // Executed tests and recorded the outputs in ShapesMain.java files
    }
}