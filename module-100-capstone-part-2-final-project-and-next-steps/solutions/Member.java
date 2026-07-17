import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Loan> loans;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.loans = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public List<Loan> getLoans() { return new ArrayList<>(loans); }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public boolean returnBook(String isbn) {
        for (Loan loan : loans) {
            if (loan.getIsbn().equals(isbn) && loan.getReturnDate() == null) {
                loan.setReturnDate(LocalDate.now());
                return true;
            }
        }
        return false;
    }

    public double calculateTotalFines(double dailyRate) {
        double total = 0;
        for (Loan loan : loans) {
            total += loan.calculateFine(dailyRate);
        }
        return total;
    }

    public String toCsv() {
        return name + "," + memberId;
    }

    public static Member fromCsv(String line) {
        String[] parts = line.split(",");
        return new Member(parts[0], parts[1]);
    }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ", loans: " + loans.size() + ")";
    }
}
