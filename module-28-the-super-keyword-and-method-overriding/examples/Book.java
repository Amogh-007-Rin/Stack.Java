class Book extends Item {
    private int pages;

    Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " | " + pages + " pages";
    }

    public int getPages() {
        return pages;
    }
}
