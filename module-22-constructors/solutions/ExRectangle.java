class ExRectangle {
    double length;
    double width;

    ExRectangle() {
        this(1.0, 1.0);
    }

    ExRectangle(double side) {
        this(side, side);
    }

    ExRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    void display() {
        String type = (length == width) ? "Square" : "Rectangle";
        System.out.println(type + " | " + length + " x " + width + " | Area: " + area());
    }
}
