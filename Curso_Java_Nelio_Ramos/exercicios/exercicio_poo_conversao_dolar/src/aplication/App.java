package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Converter!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        double real = CurrencyConverter.calc(dollar, quantity);
        System.out.printf("Amount to be paid in reais = %.2f", real);


        sc.close();
    }
}
