public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Örnek veriler ekleniyor
        Book book1 = new Book("001", "Simyacı", "Paulo Coelho", "Roman", 1988);
        Book book2 = new Book("002", "1984", "George Orwell", "Distopya", 1949);

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("1001", "Ayşe Yılmaz", "ayse@mail.com");
        Member member2 = new Member("1002", "Mehmet Kaya", "mehmet@mail.com");

        library.addMember(member1);
        library.addMember(member2);

        // Kitap arama
        System.out.println("Kitap Arama Sonuçları:");
        for (Book book : library.searchBooks("Simyacı")) {
            book.printInfo();
        }

        // Ödünç alma işlemi
        library.loanBook("001", "1001");

        // İade işlemi
        library.returnBook("001");
    }
}
