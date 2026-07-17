class LibraryItem {
    String title;
    String author;
    int year;

    LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    String getDescription() {
        return title + " by " + author + " (" + year + ")";
    }
}
