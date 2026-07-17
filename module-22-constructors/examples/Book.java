class Book {
    String title;
    String author;
    String isbn;
    int pages;
    boolean isCheckedOut;

    Book() {
        this("Unknown Title", "Unknown Author", "000-0000000000", 0);
    }

    Book(String title, String author) {
        this(title, author, "000-0000000000", 0);
    }

    Book(String title, String author, String isbn) {
        this(title, author, isbn, 0);
    }

    Book(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.isCheckedOut = false;
    }

    void displayInfo() {
        String status = isCheckedOut ? "Checked Out" : "Available";
        System.out.println(isbn + " | " + title + " by " + author + " (" + pages + " pp) [" + status + "]");
    }
}
