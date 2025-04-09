import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrada de dados!\n");

        // para entrar dados no java, e necessário a importação e criação de uma variave. Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome:");
        String x = sc.next();
        sc.close();

        System.out.printf("Muito prazer %s", x);
    }
}
