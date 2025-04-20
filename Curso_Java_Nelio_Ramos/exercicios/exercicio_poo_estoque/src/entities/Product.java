package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        if (this.quantity >= quantity) {
        this.quantity -= quantity;
        }
    }

    public String toString() {
        return "Product:\n" 
                + "name: " 
                + name 
                + ", price: $" 
                + String.format("%.2f", price)
                + ", quantity: " 
                + quantity 
                + ", Total: "
                + String.format("%.2f", totalValueInStock())
                + '\n';
    }
}
