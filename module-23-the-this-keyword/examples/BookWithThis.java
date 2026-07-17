class BookWithThis {
    String title;
    String author;
    String isbn;

    BookWithThis() {
        this("Unknown", "Unknown", "000-0000000000");
    }

    BookWithThis(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    void display() {
        System.out.println(this.isbn + " | " + this.title + " by " + this.author);
    }

    void showDetails() {
        System.out.print("Details: ");
        this.display();
    }
}
