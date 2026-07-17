class RectangleViolation {

    protected int width;
    protected int height;

    public RectangleViolation(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class SquareViolation extends RectangleViolation {

    public SquareViolation(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

interface ShapeLSP {
    int getArea();
}

class RectangleLSP implements ShapeLSP {

    private final int width;
    private final int height;

    public RectangleLSP(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class SquareLSP implements ShapeLSP {

    private final int side;

    public SquareLSP(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

public class LspExample {

    public static void main(String[] args) {
        ShapeLSP rect = new RectangleLSP(4, 5);
        ShapeLSP square = new SquareLSP(5);

        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Square area: " + square.getArea());
    }
}
