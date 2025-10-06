public class Vector {
    public double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
    return x;
    }

    public double getY() {
    return y;
    }


    public Vector scale(double factor) {
        return new Vector(this.x * factor, this.y * factor);
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public void printVector(String lable) {
        System.out.println(lable + " " + "x:" + x + ", y: " + y);
        System.out.println("Vector length: " + length());
    }
    
    @Override
    public String toString() {
    return "Vector(x: " + getX() + ", y: " + getY() + ")";
    }
    public static void main(String[] args) {
        // Executed tests and recorded the outputs in ShapesMain.java files
    }
}