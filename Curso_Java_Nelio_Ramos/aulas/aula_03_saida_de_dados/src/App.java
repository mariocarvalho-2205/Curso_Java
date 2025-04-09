import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Saida de Dados.");

        int y = 32;
        double x = 10.35784;

        System.out.println(x);
        // formatando a saida de ponto flutuante
        System.out.printf("%.4f\n", x );
        
        // para trocar o sistema numerico de acordo com a localidade usamos o locale
        Locale.setDefault(Locale.US);  // para usar o Locale, e necessario importar no topo do codigo
        System.out.printf("%.4f\n", x );

        // concatenando dados
        System.out.println("TEstando a concatenação de " + x + " Com o texto " + x + " " + x);

        // concatenando varios elementos em um mesmo comando de escrita
        System.out.printf("Resultado = %.2f metros%n", x);

        // Cocatenando varios tipos de dados
        String nome = "Mario";
        int age = 49;
        double salario = 5500.235;
        System.out.printf("%s tem %d anos e recebe %.2f de salario%n", nome, age, salario);
    }
}
