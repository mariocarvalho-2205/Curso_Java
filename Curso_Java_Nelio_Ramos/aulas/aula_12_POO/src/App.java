import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("POO - Programação Orientada a Objetos!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        System.out.print("xA: ");
        x.a = sc.nextDouble();
        System.out.print("xB: ");
        x.b = sc.nextDouble();
        System.out.print("xC: ");
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        System.out.print("yA: ");
        y.a = sc.nextDouble();
        System.out.print("yB: ");
        y.b = sc.nextDouble();
        System.out.print("yC: ");
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f \n", areaX);
        System.out.printf("Triangle Y area: %.4f \n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area triangle X");
        } else {
            System.out.println("Larger area triangle Y");
        }
        sc.close();
    }
}
