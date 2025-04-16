import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operador BitWise!");

        /*
         * E parecido com os operadores && e ||, 
         * com uma diferença. eles tem apenas um sinal, 
         * e quando for o OU-exclusivo so sera verdadeiro se apenas um for verdadeiro 
         * 
         * É usado para progreamação de baixo nivel
         * Ex: programar uma interface de rede
         */

         int n1 = 89;
         int n2 = 60;

         System.out.println(n1 & n2);
         System.out.println(n1 | n2);
         System.out.println(n1 ^ n2);

         // Exemplo


         int mask = 0b100000;
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
             System.out.println("6th bit is false!");

         }

    }
}
