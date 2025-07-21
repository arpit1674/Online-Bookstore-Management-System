package project_OnlineBookstoreManagementSystem;

class CartItem {
    private Book book;
    private int quantity;

    public CartItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return book.getPrice() * quantity;
    }

    public String toString() {
        return book.getTitle() + " x " + quantity + " = ₹" + getTotalPrice();
    }

    public Book getBook() { return book; }
    public int getQuantity() { return quantity; }
}