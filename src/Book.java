public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private int publishYear;
    private boolean isAvailable;

    public Book(String id, String title, String author, String genre, int publishYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishYear = publishYear;
        this.isAvailable = true; // Varsayılan olarak mevcut
    }

    // Getter ve Setter metodları
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // Diğer getter ve setter metodları...

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Kitap bilgilerini yazdıran metot
    public void printInfo() {
        System.out.println("Kitap ID: " + id);
        System.out.println("Başlık: " + title);
        System.out.println("Yazar: " + author);
        System.out.println("Tür: " + genre);
        System.out.println("Yayın Yılı: " + publishYear);
        System.out.println("Durum: " + (isAvailable ? "Mevcut" : "Ödünçte"));
    }


}
