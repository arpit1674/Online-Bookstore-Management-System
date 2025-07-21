package project_OnlineBookstoreManagementSystem;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addToCart(Book book, int quantity) {
        if (book.getQuantity() >= quantity) {
            items.add(new CartItem(book, quantity));
            book.reduceQuantity(quantity);
            System.out.println("Added to cart.");
        } else {
            System.out.println("Insufficient stock.");
        }
    }

    public void viewCart() {
        for (CartItem item : items) System.out.println(item);
        System.out.println("Total: ₹" + calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) total += item.getTotalPrice();
        return total;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }
}