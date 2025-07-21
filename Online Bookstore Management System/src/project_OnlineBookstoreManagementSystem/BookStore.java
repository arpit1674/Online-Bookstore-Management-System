package project_OnlineBookstoreManagementSystem;
import java.util.List;
import java.util.ArrayList;

class BookStore {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void addBook(String title, String author, String genre, double price, int quantity) {
        books.add(new Book(nextId++, title, author, genre, price, quantity));
    }

    public void displayAllBooks() {
        for (Book book : books) System.out.println(book);
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.getQuantity() > 0) return book;
        }
        return null;
    }

    public void searchByTitle(String keyword) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                System.out.println(book);
        }
    }

    public void searchByGenre(String genre) {
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) System.out.println(book);
        }
    }
}