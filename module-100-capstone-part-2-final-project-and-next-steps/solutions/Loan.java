import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
    private static final int LOAN_PERIOD_DAYS = 14;

    private String isbn;
    private String memberId;
    private LocalDate checkoutDate;
    private LocalDate returnDate;

    public Loan(String isbn, String memberId, LocalDate checkoutDate) {
        this.isbn = isbn;
        this.memberId = memberId;
        this.checkoutDate = checkoutDate;
        this.returnDate = null;
    }

    public String getIsbn() { return isbn; }
    public String getMemberId() { return memberId; }
    public LocalDate getCheckoutDate() { return checkoutDate; }
    public LocalDate getReturnDate() { return returnDate; }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public double calculateFine(double dailyRate) {
        LocalDate dueDate = checkoutDate.plusDays(LOAN_PERIOD_DAYS);
        LocalDate actualReturn = (returnDate != null) ? returnDate : LocalDate.now();
        long daysOverdue = ChronoUnit.DAYS.between(dueDate, actualReturn);
        if (daysOverdue <= 0) return 0.0;
        return daysOverdue * dailyRate;
    }
}
