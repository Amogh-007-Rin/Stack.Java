class LibraryBook {
    String title;
    String author;
    int yearPublished;
    boolean isAvailable;

    LibraryBook() {
        this("Unknown", "Unknown", 0);
    }

    LibraryBook(String title, String author, int yearPublished) {
        this(title, author, yearPublished, true);
    }

    LibraryBook(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    void display() {
        String status = isAvailable ? "Available" : "Checked Out";
        System.out.println(title + " by " + author + " (" + yearPublished + ") [" + status + "]");
    }
}
