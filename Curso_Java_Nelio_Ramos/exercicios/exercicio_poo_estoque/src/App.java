import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrada e Saida de Produtos!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.next();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.println();

        int quantity;

        char op;

        do {
            
            System.out.print("Digite (S) Sair - (A) Adicionar - (R) Remover: ");
            op = sc.next().charAt(0);

            if (op == 'a') {
                System.out.print("Enter the number of products to be added in stock: ");
    
                quantity = sc.nextInt();
                product.addProduct(quantity);
                System.out.println("Updated data: " + product);
    
            } else if (op == 'r') {
                System.out.print("Enter the number of products to be removed from stock: ");
    
                quantity = sc.nextInt();
                product.removeProduct(quantity);
                System.out.println("Updated data: " + product);
    
            } else if (op == 's') {
                System.out.println("Saindo...");
            }
        } while (op != 's');
        

        sc.close();

    }
}
