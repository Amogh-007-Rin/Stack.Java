class BookBuilder {
    String title;
    String author;
    String isbn;
    int pages;

    BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    BookBuilder setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    BookBuilder setPages(int pages) {
        this.pages = pages;
        return this;
    }

    void display() {
        System.out.println(isbn + " | " + title + " by " + author + " (" + pages + " pp)");
    }
}
