interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + " | Title: " + title + " | Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 14; }
    public void reserveItem(String user) { available = false; System.out.println("Book reserved by " + user); }
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    public Magazine(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 7; }
    public void reserveItem(String user) { available = false; System.out.println("Magazine reserved by " + user); }
    public boolean checkAvailability() { return available; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 3; }
    public void reserveItem(String user) { available = false; System.out.println("DVD reserved by " + user); }
    public boolean checkAvailability() { return available; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book(1, "Java Basics", "James"),
                new Magazine(2, "Tech Today", "Editor"),
                new DVD(3, "Inception", "Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem("User1");
                System.out.println("Available? " + ((Reservable) item).checkAvailability());
            }
            System.out.println(" ");
        }
    }
}
