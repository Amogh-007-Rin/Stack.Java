class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Radius: " + radius);
    }
}
