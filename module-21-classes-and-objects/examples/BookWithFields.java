class BookWithFields {
    String title;
    String author;
    String isbn;
    int pages;
    boolean isCheckedOut;

    void printDetails() {
        String status = isCheckedOut ? "Checked Out" : "Available";
        System.out.println(isbn + " | " + title + " by " + author + " (" + pages + " pp) [" + status + "]");
    }

    void checkOut() {
        if (isCheckedOut) {
            System.out.println(title + " is already checked out.");
        } else {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        }
    }

    void returnBook() {
        if (!isCheckedOut) {
            System.out.println(title + " was not checked out.");
        } else {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        }
    }
}
