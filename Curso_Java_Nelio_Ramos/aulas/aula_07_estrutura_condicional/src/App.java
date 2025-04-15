import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estruturas condicionais!");
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int fixo = 10;
        String dia;
        
        // If
        if (entrada > fixo) {
            System.out.println("A é maior que B");
        } else if (entrada < fixo) {
            System.out.println("A e menor que B");
        } else {
            System.out.println("A e igual a B");
        }
        ;
        
        // Switch
        switch (entrada) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
                case 7:
                dia = "sabado";
                break;
                default:
                dia = "Dia invalido";
                break;
                
            }
            
            // Condicional Ternaria
            double preco = 34.5;
            double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
            // OBS: Escopo de variavel, a variavel precisa ser inicializada antes de ser usada
            // e ter um valor atribuido, caso nao tenha, ela precisa ter um valor atribuido posteriormente caso
            // ela passe por alguma estrutura condicional

        System.out.printf("O dia da semana é %s\n", dia);
        System.out.printf("O preco com desconto aplicado é R$ %.3f", desconto);

        sc.close();
    }

}
