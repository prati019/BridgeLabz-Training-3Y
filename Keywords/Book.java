public class Book {
    private String title;
    private String author;
    private final String isbn;   // unique id

    private static String libraryName = "City Library";

    // Constructor with this
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void display() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN101");
        Book b2 = new Book("Python Guide", "Guido", "ISBN102");

        Book.displayLibraryName();
        b1.display();
        b2.display();
    }
}
