import com.stackjava.geometry.Circle;
import com.stackjava.geometry.Rectangle;

public class Exercise1Solution {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    }
}
