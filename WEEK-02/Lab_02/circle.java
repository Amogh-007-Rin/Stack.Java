import java.util.*;

public class Circle {
    Vector center;
    double radius;


    public Circle(Vector center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getDiameter(){
        return Math.abs(2*this.radius);
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius , 2);
    }

    public boolean contains(Vector point){
        Vector offSet = point.subtract(this.center);
        return (offSet.length() <= this.radius);
    }

    public Rectangle boundingBox(){
        double cx = this.center.x;
        double cy = this.center.y;
        Vector p1 = new Vector(cx - this.radius , cy - this.radius);
        Vector p2 = new Vector(cx + this.radius , cy + this.radius);
        return new Rectangle(p1,p2);
    }
    @Override
    public String toString() {
    return "Circle(center: [" + center.x + ", " + center.y + "], radius: " + radius + ")";
    }
    public static void main(String args[]){
        Vector v1 = new Vector(1,3);
        Circle c1 = new Circle(v1,5);
        System.out.println("---------------------Run Start----------------------");
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println("Area: " + c1.getArea());
        System.out.println();
        System.out.println("Diameter: " + c1.getDiameter());
        System.out.println();
        System.out.println(c1.boundingBox());
        System.out.println();
        System.out.println("----------------------Run End------------------------");
    }
    }