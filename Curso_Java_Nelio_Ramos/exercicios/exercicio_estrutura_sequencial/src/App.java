import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicios Funções Matematicas");

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        // Exercicio 01
        System.out.println("Exercicio 01 - Soma de dois valores.");
        System.out.println("Digite dois valores para a soma");
        int num1, num2, soma;
        
        System.out.println("Digite o primeiro valor:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        num2 = scanner.nextInt();
        
        soma = num1 + num2;
        System.out.printf("A soma de %d + %d é %d\n", num1, num2, soma);
        
        // Exercicio 02
        System.out.println("Exercicio 02 - Area do Circulo");
        double raio, area, pi;
        pi = 3.14159;
        System.out.println("Digite o raio do circulo:");
        raio = scanner.nextDouble();
        area = pi * Math.pow(raio, 2);
        // calculo da area do circulo
        
        System.out.printf("A area do circulo é %.4f\n", area);
        
        
        scanner.close();
    }
}
