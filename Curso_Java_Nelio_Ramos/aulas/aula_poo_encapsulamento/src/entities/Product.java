package entities;

public class Product {
    // pro convenção os atributos precisam ser privados
    // e para serem atualizados, precisa utilizar os metodos set e get para acessar
    // e deve ser criados depois dos contrutorres
    private String name;
    private double price;
    private int quantity;

    // contrutor em formato public, nao deve ser usado assim 
    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    // get
    public String getName() {
        return name;
    }
    
    // set
    public void setName(String name) {
        this.name = name;
    }

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
