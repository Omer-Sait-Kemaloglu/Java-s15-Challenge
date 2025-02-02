import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private String contact;
    private List<Loan> loans;

    public Member(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.loans = new ArrayList<>();
    }

    // Getter ve Setter metodları
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Diğer getter ve setter metodları...

    public List<Loan> getLoans() {
        return loans;
    }

    // Ödünç alınan kitabı ekleyen metot
    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    // Üye bilgilerini yazdıran metot
    public void printInfo() {
        System.out.println("Üye ID: " + id);
        System.out.println("İsim: " + name);
        System.out.println("İletişim: " + contact);
        System.out.println("Ödünç Alınan Kitaplar:");
        for (Loan loan : loans) {
            System.out.println("- " + loan.getBook().getTitle());
        }
    }
}
