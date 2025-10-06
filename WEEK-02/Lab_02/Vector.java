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
        Vector v1 = new Vector(3, 4);
        Vector v2 = new Vector(1, 2);
        System.out.println();
        System.out.println("-------------------------------Run Start-------------------------------");
        v1.printVector("Vector 1 :");
        System.out.println();
        v2.printVector("Vector 2 :");
        System.out.println();
        Vector v3 = v1.add(v2);
        v3.printVector("Vector 3 :");
        System.out.println();
        Vector v4 = v1.subtract(v2);
        v4.printVector("Vector 4 :");
        System.out.println();
        Vector v5 = v1.scale(2);
        v5.printVector("Vector 5 :");
        System.out.println("-------------------------------Run Start-------------------------------");
    }
}