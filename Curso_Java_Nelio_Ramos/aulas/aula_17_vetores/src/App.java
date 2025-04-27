import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vetores!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas para ler as alturas.");

        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Digite a %d altura: ", i + 1);
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0;i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("Average Height = %.2f", avg);

        sc.close();

    }
}
