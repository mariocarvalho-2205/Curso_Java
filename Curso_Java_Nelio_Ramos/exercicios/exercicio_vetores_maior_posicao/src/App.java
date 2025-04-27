import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio Vetores - Maior Posição!");

        int n, mposicao;
        double mvalor;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %do numero: ", i + 1);
            vect[i] = sc.nextDouble();
        }

        mposicao = 0;
        mvalor = 0.0;

        for(int i = 0; i < vect.length; i++) {
            if (vect[i] > mvalor) {
                mvalor = vect[i];
                mposicao = i;
            }
        }

        System.out.printf("Maior valor = %.1f\nPosição do maior valor = %d", mvalor, mposicao);

        sc.close();


    }
}
