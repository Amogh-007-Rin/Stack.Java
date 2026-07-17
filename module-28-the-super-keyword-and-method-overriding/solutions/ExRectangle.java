class ExRectangle extends Shape {
    private double length;
    private double width;

    ExRectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Dimensions: " + length + " x " + width);
    }
}
