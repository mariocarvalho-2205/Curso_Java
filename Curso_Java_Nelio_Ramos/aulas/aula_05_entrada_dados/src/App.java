import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrada de dados!\n");

        // para entrar dados no java, e necessário a importação e criação de uma variave. Scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome Completo:");
        // String nome = sc.next();
        String nome_completo; // variavel para armazenar o nome completo
        char x;
        
        // para ler e necessario utilizar o nextLine()
        // ! !!! IMPORTANTE !!!!
        // o next() lê apenas a primeira palavra, e o nextLine() lê tudo
        // Caso venhamos utilizar uma entrada de algum outro typo antes, e necessario chamar 
        // um nextLine() sozinho antes das entradas dos proximos next line
        sc.nextLine(); // dessa forma conseguiremos ler as todas as entradas, ou seja ele vai consumir o nextLine extra
        // limpando o buffer de entrada, e assim não teremos problemas de entrada de dados
        nome_completo = sc.nextLine();
        System.out.printf("Muito prazer %s\n", nome_completo);
        
        System.out.println("Qual a sua idade? ");

        int age = sc.nextInt();
        
        System.out.println("Que legal, você tem " + age + " anos");
        
        System.out.println("Esta trabalhando? Quanto esta ganhando?");

        double salario = sc.nextDouble();

        System.out.printf("Poww %s, Votê tem %s anos e ainda recebe R$ %.2f de salario. Muito bom!\n", nome_completo, age, salario);
        
        System.out.println("Você não me falou o sexo");
        
        x = sc.next().charAt(0);
        
        System.out.printf("Você é %s", x);


        
        sc.close();
        
    }
}
