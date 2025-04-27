import java.util.Locale;
import java.util.Scanner;

import intities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vetores parte 02!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length;i++) {
            sc.nextLine();
            System.out.printf("Digite o nome do %d produto: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Digite o preço do %d produto: ", i + 1);
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("A media do valor dos produtos é %.2f", avg);
        
        // System.out.println(vect[0].getName());

        sc.close();
    }
}
