import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estrutura de Repetição!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int x = 0;

        while (x < entrada) {
            System.out.printf("O valor de X é de %d \n", x);
            x++;
        }

        for (int i = 0; i < entrada; i++) {
            System.out.printf("O valor de I é %d \n", i);
        }

        for (int negativo = entrada; negativo >= 0; negativo--) {
            System.out.printf("Negativo e igual a %d \n", negativo);
        }
        int f = 0;
        do {
            System.out.println("No Do while a condição e no final nesse caso será lido primeiro o codigo para depois a condição");
            System.out.printf("E o valor de x é %d \n", f);
            f++;
        } while (f < entrada);
        sc.close();
    }
}
