class BookWithCounter {
    private String title;
    private static int totalBooksCreated = 0;

    public BookWithCounter(String title) {
        this.title = title;
        totalBooksCreated++;
    }

    public String getTitle() {
        return title;
    }

    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }
}
