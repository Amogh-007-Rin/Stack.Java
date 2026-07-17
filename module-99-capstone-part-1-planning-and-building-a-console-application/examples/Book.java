public class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getCopies() { return copies; }

    public void setCopies(int copies) { this.copies = copies; }

    public boolean isAvailable() {
        return copies > 0;
    }

    public boolean checkout() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    public void returnCopy() {
        copies++;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ", copies: " + copies + ")";
    }

    public String toCsv() {
        return title + "," + author + "," + isbn + "," + copies;
    }

    public static Book fromCsv(String line) {
        String[] parts = line.split(",");
        return new Book(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]));
    }
}
