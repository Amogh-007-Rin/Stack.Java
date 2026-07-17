import com.stackjava.library.model.Book;
import com.stackjava.library.service.LibraryService;

public class Exercise3Solution {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", "978-0451524935");
        LibraryService service = new LibraryService();
        service.checkoutBook(book);
    }
}
