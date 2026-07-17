class Rectangle {
    double length;
    double width;

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    boolean isSquare() {
        return length == width;
    }
}
