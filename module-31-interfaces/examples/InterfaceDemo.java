class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class Report implements Drawable, Printable {
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void draw() {
        System.out.println("Drawing report: " + title);
    }

    @Override
    public void print() {
        System.out.println("Printing report: " + title);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable circle = new Circle(5.0);
        circle.draw();

        Report report = new Report("Annual Report");
        report.draw();
        report.print();

        Drawable d = report;
        Printable p = report;
        d.draw();
        p.print();
    }
}
