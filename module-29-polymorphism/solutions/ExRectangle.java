class ExRectangle extends ExShape {
    private double length;
    private double width;

    ExRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}
