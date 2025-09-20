import java.util.*;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title; this.author = author;
    }
    void display() { System.out.println("Book: " + title + " by " + author); }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();
    Library(String name) { this.name = name; }
    void addBook(Book b) { books.add(b); }
    void showBooks() {
        System.out.println("\nLibrary: " + name);
        for(Book b: books) b.display();
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics","James");
        Book b2 = new Book("Data Structures","Mark");
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");
        lib1.addBook(b1); lib1.addBook(b2);
        lib2.addBook(b2);
        lib1.showBooks();
        lib2.showBooks();
    }
}
