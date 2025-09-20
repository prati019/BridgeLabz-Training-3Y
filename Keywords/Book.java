class Book {
    static String libraryName = "BridgeLabz Library";
    private String title;
    private String author;
    final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN001");
        Book b2 = new Book("Python Advanced", "Guido van Rossum", "ISBN002");

        Book.displayLibraryName();
        b1.displayBookDetails();
        System.out.println();
        b2.displayBookDetails();
    }
}
