import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio Vetores - Alturas!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, nmenores;
        double alturaTota, alturaMedia, percentualMenores;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
        }

        nmenores = 0;
        alturaTota = 0.0;
        for (int i = 0; i < n; i++) {
            if(idade[i] < 16) {
                nmenores++;
            }
            alturaTota += altura[i];
        }

        alturaMedia = alturaTota / n;
        
        percentualMenores = ((double)nmenores / n) * 100.0;
        
        
        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentualMenores);
        
        for(int i = 0; i < n; i++) {
            if(idade[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        
        sc.close();
    }
}
