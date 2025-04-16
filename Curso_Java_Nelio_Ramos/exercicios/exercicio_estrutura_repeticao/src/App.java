import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       

        char resp = 's';


        while (resp != 'n') {
            System.out.println("While Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
    
            System.out.printf("Equivalente em Fahrenheith: %.2f\n", F);
            System.out.println("Deseja repetir? ");
            resp = sc.next().charAt(0);
            
        }
        System.out.println("Obrigado por utilizar nossos serviços.");

        char respDo;
        do {
            System.out.println("Do While Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
    
            System.out.printf("Equivalente em Fahrenheith: %.2f\n", F);
            System.out.println("Deseja repetir? ");
            respDo = sc.next().charAt(0);

        } while (respDo != 'n');
        System.out.println("Obrigado por utilizar nossos serviços.");



        sc.close();
    }
}
