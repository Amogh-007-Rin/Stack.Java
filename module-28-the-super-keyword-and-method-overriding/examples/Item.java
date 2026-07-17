class Item {
    protected String title;
    protected String author;
    protected int year;

    Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getDescription() {
        return title + " by " + author + " (" + year + ")";
    }
}
