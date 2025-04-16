import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
         * Funções
         * • Representam um processamento que possui um significado
         * • Math.sqrt(double)
         * • System.out.println(string)
         * • Principais vantagens: modularização, delegação e reaproveitamento
         * • Dados de entrada e saída
         * • Funções podem receber dados de entrada (parâmetros ou argumentos)
         * • Funções podem ou não retornar uma saída
         * • Em orientação a objetos, funções em classes recebem o nome de
         * "métodos
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        System.out.print("number a: ");
        int a = sc.nextInt();
        System.out.print("number b: ");
        int b = sc.nextInt();
        System.out.print("number c: ");
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

    public static int max(int a, int b, int c) {
        int aux;

        if (a > b && a > c) {
            aux = a;
            System.out.printf("Higher is a: %d\n", a);
        } else if (b > c) {
            aux = b;
            System.out.printf("Higher is b: %d\n", b);
        } else {
            aux = c;
            System.out.printf("Higher is c: %d\n", c);
        }

        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher is value: " + value);
    }
}
