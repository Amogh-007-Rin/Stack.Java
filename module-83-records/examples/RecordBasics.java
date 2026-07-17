record Point(int x, int y) {}

record Line(Point start, Point end) {}

public class RecordBasics {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        System.out.println("p1 = " + p1);
        System.out.println("p1.x() = " + p1.x());
        System.out.println("p1.y() = " + p1.y());

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());

        Line line = new Line(new Point(0, 0), new Point(10, 10));
        System.out.println("line = " + line);
        System.out.println("start: " + line.start());
        System.out.println("end: " + line.end());
    }
}
