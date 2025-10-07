// StudentName : Amogh Dath Kalasapura Arunkumar
// StudentId : 24168333
// StudentEmail : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

// ShapesMain.java is a driver file to run tests and get the output 


public class ShapesMain {
      
    public static void main(String args[]){
        
        // Vector outputs
        
        Vector v1 = new Vector(3, 4);
        Vector v2 = new Vector(1, 2);
        System.out.println();
        System.out.println("-------------------------------Run Start-------------------------------");
        v1.printVector("Vector 1 :");
        System.out.println();
        v2.printVector("Vector 2 :");
        System.out.println();
        Vector sum = v1.add(v2);
        sum.printVector("Sum of Vector 1 and Vector 2 is :");
        System.out.println();
        Vector sub = v1.subtract(v2);
        sub.printVector("Difference of Vector 1 and Vector 2 is :");
        System.out.println();
        Vector v5 = v1.scale(2);
        v5.printVector("Vector 5 :");
        Vector v6 = v2.scale(3);
        v6.printVector("Vector 6 :");
        System.out.println("-------------------------------Run Start-------------------------------");


        // Rectangle outputs


        System.out.println("-----------------Run Started-----------------");
        Vector a1 = new Vector(1,3);
        Vector a2 = new Vector(4,5);
        Rectangle rect = new Rectangle(a1,a2);
        Vector p = new Vector(2,4);
        System.out.println("Does rectangle contains point (2,4)? : " + rect.contains(p));
        rect.printRectangle();
        System.out.println();
        System.out.println("----------------Run Completed----------------");
        System.out.println();
    

        // Circle output

        Vector r1 = new Vector(1,3);
        Circle c1 = new Circle(r1,5);
        System.out.println("---------------------Run Start----------------------");
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println("Area: " + c1.getArea());
        System.out.println();
        System.out.println("Diameter: " + c1.getDiameter());
        System.out.println();
        System.out.println(c1.boundingBox());
        System.out.println();
        System.out.println("----------------------Run End------------------------");

    }

}
