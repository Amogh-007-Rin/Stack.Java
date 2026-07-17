public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("=== Method Chaining with 'return this' ===");

        BookBuilder b1 = new BookBuilder();
        b1.setTitle("Dune")
          .setAuthor("Frank Herbert")
          .setIsbn("978-0441172719")
          .setPages(688);
        b1.display();

        BookBuilder b2 = new BookBuilder();
        b2.setAuthor("Orwell").setTitle("1984").setIsbn("978-0451524935").setPages(328);
        b2.display();

        System.out.println("\nWithout chaining (traditional style):");
        BookBuilder b3 = new BookBuilder();
        b3.setTitle("Neuromancer");
        b3.setAuthor("William Gibson");
        b3.display();
    }
}
