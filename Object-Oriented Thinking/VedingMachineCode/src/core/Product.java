package core;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void updateQuantity(int amount) {
        this.quantity += amount;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
