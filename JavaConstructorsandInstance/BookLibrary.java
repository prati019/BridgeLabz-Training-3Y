public class BookLibrary {
    // Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Methods to set and get author (private)
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass
class EBook extends Book {
    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to demonstrate access to ISBN and title
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // public
        System.out.println("Title: " + title); // protected
        System.out.println("Author: " + getAuthor()); // private, accessed via method
    }
}

// Main class for demo
class BookLibrarySystem {
    public static void main(String[] args) {
        Book b = new Book("123-456-789", "Java Programming", "John Doe");
        b.displayDetails();

        b.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + b.getAuthor());

        EBook eb = new EBook("987-654-321", "Advanced Java", "Alice Johnson");
        eb.displayEBookDetails();
    }
}
