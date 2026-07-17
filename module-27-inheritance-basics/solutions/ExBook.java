class ExBook extends LibraryItem {
    int pages;

    ExBook(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " | " + pages + " pages";
    }
}
