class LibraryItem {
    public String title;
    protected String author;
    String isbn;
    private int checkoutCount;

    public LibraryItem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.checkoutCount = 0;
    }

    public void checkout() {
        checkoutCount++;
        System.out.println(title + " checked out. Total: " + checkoutCount);
    }

    public int getCheckoutCount() {
        return checkoutCount;
    }

    void resetCheckoutCount() {
        checkoutCount = 0;
    }

    private void logAccess(String action) {
        System.out.println("[LOG] " + action + " on " + title);
    }
}
