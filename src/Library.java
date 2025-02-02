import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;
    private List<Reservation> reservations;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        loans = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    // Kitap ekleme metodu
    public void addBook(Book book) {
        books.add(book);
    }

    // Üye ekleme metodu
    public void addMember(Member member) {
        members.add(member);
    }

    // Kitap arama metodu
    public List<Book> searchBooks(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())
                    || book.getGenre().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    // Ödünç alma metodu
    public boolean loanBook(String bookId, String memberId) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book != null && member != null && book.isAvailable()) {
            book.setAvailable(false);
            Loan loan = new Loan(book, member);
            loans.add(loan);
            member.addLoan(loan);
            System.out.println("Kitap başarıyla ödünç alındı.");
            return true;
        } else {
            System.out.println("Ödünç alma işlemi başarısız.");
            return false;
        }
    }

    // İade metodu
    public boolean returnBook(String bookId) {
        for (Loan loan : loans) {
            if (loan.getBook().getId().equals(bookId)) {
                loan.getBook().setAvailable(true);
                loans.remove(loan);
                System.out.println("Kitap başarıyla iade edildi.");
                return true;
            }
        }
        System.out.println("İade işlemi başarısız.");
        return false;
    }

    // Yardımcı metodlar
    private Book findBookById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }
}
