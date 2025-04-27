import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio Vetores - Numeros Pares!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, pares;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        pares = 0;
        System.out.println("Numeros pares: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                pares++;
            }
        }

        System.out.printf("\nQuantidade de pares = %d", pares);

        sc.close();
    }
}
