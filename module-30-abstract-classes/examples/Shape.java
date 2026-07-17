abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }

    public void display() {
        System.out.println("This is a " + color + " shape.");
    }
}
