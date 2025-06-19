package task1
import java.util.*;

class Library {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added.");
    }

    public void issue(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issue();
                System.out.println(title + " issued.");
                return;
            }
        }
        System.out.println("Book not found or already issued.");
    }

    public void show() {
        System.out.println("Books in library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + (book.isIssued() ? " (Issued)" : ""));
        }
    }
}
