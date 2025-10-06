
import java.util.*;


public class Rectangle {
    Vector v1;
    Vector v2;


    public Rectangle(Vector v1, Vector v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    public double getWidth(){
        return Math.abs(this.v1.x - this.v2.x);
    }

    public double getHeight(){
        return Math.abs(this.v1.y - this.v2.y);
    }

    public double getArea(){
        return Math.abs(this.getWidth() * this.getHeight());
    }

    public Vector getCenter(){
        double centerX = (this.v1.x + this.v2.x)/2;
        double centerY = (this.v1.y + this.v2.y)/2;
        return new Vector(centerX , centerY);

    }

    public boolean contains(Vector point){
        return (point.x >= v1.x && point.x <= v2.x && point.y >= v1.y && point.y <= v2.y );
    }

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
    @Override
    public String toString() {
        return "Rectangle(v1: [" + v1.x + ", " + v1.y + "], v2: [" + v2.x + ", " + v2.y + "])";
    }


    public static void main(String args[]){
       // Executed tests and recorded the outputs in ShapesMain.java files
    }

}

