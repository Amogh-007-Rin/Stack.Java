import java.util.*;

public class Rectangle {
    Vector v1;
    Vector v2;


    public Rectangle(Vector v1, Vector v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    public double width(){
        return this.v1.x - this.v2.x;
    }

    public double height(){
        return this.v1.y - this.v2.y;
    }

    public double area(){
        return this.width() * this.height();
    }


    public double center(){
       
    }
}

