class ExCircle extends ExShape {
    private double radius;

    ExCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
