record MyPoint(int x, int y) {}
record MyLine(MyPoint start, MyPoint end) {}
record MyRect(MyPoint topLeft, MyPoint bottomRight) {}

public class RecordPatternsDemo {

    static void printPoint(Object obj) {
        if (obj instanceof MyPoint(int x, int y)) {
            System.out.println("Point at (" + x + ", " + y + ")");
        }
    }

    static void printLine(Object obj) {
        if (obj instanceof MyLine(MyPoint(int x1, int y1), MyPoint(int x2, int y2))) {
            System.out.println("Line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
        }
    }

    static String describe(Object obj) {
        return switch (obj) {
            case MyPoint(int x, int y)              -> "Point(" + x + "," + y + ")";
            case MyLine(MyPoint a, MyPoint b)        -> "Line " + a + " -> " + b;
            case MyRect(MyPoint tl, MyPoint br)      -> "Rect " + tl + " -> " + br;
            case null                                -> "null";
            default                                  -> "Unknown: " + obj;
        };
    }

    public static void main(String[] args) {
        printPoint(new MyPoint(3, 4));
        printLine(new MyLine(new MyPoint(0, 0), new MyPoint(10, 10)));

        Object[] items = {
            new MyPoint(1, 2),
            new MyLine(new MyPoint(0, 0), new MyPoint(5, 5)),
            new MyRect(new MyPoint(0, 0), new MyPoint(10, 20)),
            "hello",
            null
        };

        for (Object o : items) {
            System.out.println(describe(o));
        }
    }
}
