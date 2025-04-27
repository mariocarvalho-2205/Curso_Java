import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("=== Bem Vindo ao Java Bank! ===");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = null; // <--- CRIAR FORA DO WHILE

        
        while (true) {
            
            System.out.println("\n=== Escolha a opção desejada ===");
            System.out.println("\n1 - Criar nova conta");
            System.out.println("2 - Deposito");
            System.out.println("3 - Saque");
            System.out.println("4 - Mudar o nome");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer



            if (opcao == 1) {
                System.out.println("Informe seu dados para abrir a conta");

                System.out.print("Enter account number: ");
                int number = sc.nextInt();

                System.out.print("Enter account holder: ");
                sc.nextLine();
                String holder = sc.nextLine();
                
                System.out.print("Is there na initial deposit (y/n)? ");
                char response = sc.next().charAt(0);
        
                if (response == 'y') {
                    System.out.print("Enter initial deposit value: ");
                    double initialDeposit = sc.nextDouble();
                    account = new Account(number, holder, initialDeposit);
                    System.out.println(account);
                } else if (response == 'n'){
                    account = new Account(number, holder);
                    System.out.println(account);
                }
            } else if (opcao == 2) {
                System.out.print("Enter a deposit value: ");
                double depositValue = sc.nextDouble();
                account.deposit(depositValue);
                System.out.println("Updated Account data:");
                System.out.println(account);

            } else if (opcao == 3) {
                System.out.print("Enter a withdraw value: ");
                double withdrawValue = sc.nextDouble();
                account.withdraw(withdrawValue);
                System.out.println("Updated Account data:");
                System.out.println(account);           

            } else if (opcao == 4) {
                if(account != null) {
                    System.out.print("Digite o novo nome: ");
                    String newHolder = sc.nextLine();
                    account.setHolder(newHolder);
                    System.out.println("Holder updated");
                    System.out.println(account);

                }
            } else if (opcao == 5) {
                System.out.println("\nObrigado e volte sempre!");
                break;
            } else {
                System.out.println("Opção invalida");
            }
 

        }

        sc.close();

    }
}
