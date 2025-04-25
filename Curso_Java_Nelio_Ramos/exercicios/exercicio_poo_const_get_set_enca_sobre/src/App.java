import java.util.Locale;
import java.util.Scanner;

import util.Bank;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem Vindo ao Java Bank!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        
        System.out.print("Is there na initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);

        if (initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            Bank openAccount = new Bank(accountNumber, accountHolder, initialDeposit);
            
        } else {
            Bank openAccount = new Bank(accountNumber, accountHolder);
        }

    }
}
