package project_OnlineBookstoreManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStore store = new BookStore();
        Cart cart = new Cart();
        Customer customer = new Customer("User");

        store.addBook("Clean Code", "Robert C. Martin", "Programming", 499.0, 5);
        store.addBook("Atomic Habits", "James Clear", "Self-Help", 299.0, 10);
        store.addBook("The Alchemist", "Paulo Coelho", "Fiction", 199.0, 7);

        while (true) {
            System.out.println("\n--- Online Bookstore ---");
            System.out.println("1. View All Books");
            System.out.println("2. Search by Title");
            System.out.println("3. Search by Genre");
            System.out.println("4. Add to Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Checkout");
            System.out.println("7. View Purchase History");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    store.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter title keyword: ");
                    store.searchByTitle(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter genre: ");
                    store.searchByGenre(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Book ID to add: ");
                    int id = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    Book book = store.getBookById(id);
                    if (book != null) {
                        cart.addToCart(book, qty);
                    } else {
                        System.out.println("Book not found or out of stock.");
                    }
                    break;
                case 5:
                    cart.viewCart();
                    break;
                case 6:
                    customer.purchase(cart);
                    break;
                case 7:
                    customer.viewHistory();
                    break;
                case 8:
                    System.out.println("Thanks for visiting.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
            
        }
    }
    
}