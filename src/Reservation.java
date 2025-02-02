import java.time.LocalDate;

public class Reservation {
    private Book book;
    private Member member;
    private LocalDate reservationDate;

    public Reservation(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.reservationDate = LocalDate.now();
    }

    // Getter metodları
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }
}
