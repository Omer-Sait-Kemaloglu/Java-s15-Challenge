import java.time.LocalDate;

public class Loan {
    private Book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.loanDate = LocalDate.now();
        this.dueDate = loanDate.plusWeeks(2); // Ödünç süresi 2 hafta
    }

    // Getter metodları
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    // Gecikme kontrolü yapan metot
    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }
}
