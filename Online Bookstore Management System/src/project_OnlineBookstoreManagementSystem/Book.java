package project_OnlineBookstoreManagementSystem;

class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private double price;
    private int quantity;

    public Book(int id, String title, String author, String genre, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void reduceQuantity(int qty) { this.quantity -= qty; }

    public String toString() {
        return "[" + id + "] " + title + " by " + author + " | " + genre + " | ₹" + price + " | Stock: " + quantity;
    }
}