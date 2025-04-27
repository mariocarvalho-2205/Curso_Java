import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio Vetores - Soma Vetor!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");

        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];
        double soma = 0.0;
        
        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        
        System.out.print("Vetores = ");
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("%2.1f ", vect[i]);
        }
        double media = soma / vect.length;
        System.out.printf("\nSoma = %.2f", soma);
        System.out.printf("\nMedia = %.2f", media);
    }
}
