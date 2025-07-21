package project_OnlineBookstoreManagementSystem;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<CartItem> purchaseHistory = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void purchase(Cart cart) {
        purchaseHistory.addAll(cart.getItems());
        System.out.println("Purchase successful. Amount paid: ₹" + cart.calculateTotal());
        cart.clearCart();
    }

    public void viewHistory() {
        if (purchaseHistory.isEmpty()) {
            System.out.println("No purchase history.");
        } else {
            for (CartItem item : purchaseHistory) {
                System.out.println(item);
            }
        }
    }
}