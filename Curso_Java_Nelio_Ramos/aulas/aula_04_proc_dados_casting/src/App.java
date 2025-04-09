import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Processamento de dados - Casting");
        
        double b, B, h, area;
        Locale.setDefault(Locale.US);
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        
        System.out.printf("A area calculada de um espaço %.1f de Base Inferior, %.1f de base Superior e altura de %.1f, é de %.2f metros quadrados\n", B, b, h, area);

        // para fazer o casting de um dado (convertendo o valor de int para double utilizamos (int) antes do valor da variavel)

        double a = 5.0;
        int c = (int) a;

        System.out.println(c);
    }
}
