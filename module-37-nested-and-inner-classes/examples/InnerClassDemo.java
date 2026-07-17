class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }

    class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void display() {
            System.out.println(title + " is in " + name);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Library lib = new Library("City Library");
        Library.Book book = lib.new Book("Java Programming");
        book.display();
    }
}
