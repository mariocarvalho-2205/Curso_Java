import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Circunferência!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();


        double c = Calculator.circunferencia(radius);
        double v = Calculator.volume(radius);
        double p = Calculator.PI;

        System.out.printf("Circunference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("Pi value: %.2f\n", p);
        




        sc.close();
    }
}
