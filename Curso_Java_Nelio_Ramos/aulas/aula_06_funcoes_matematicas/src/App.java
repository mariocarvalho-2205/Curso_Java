public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Funções Matematicas!");
        // demais funçõe encontra em java.lang.Math

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.printf("A raiz quadrada de %.1f = %.8f\n", x, a);
        System.out.printf("A raiz quadrada de %.1f = %.1f\n", y, b);
        System.out.printf("A raiz quadrada de %.1f = %.1f\n", z, c);
        
        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        System.out.printf("%.1f elevado a %.1f = %.1f\n", x, y, a);
        System.out.printf("%.1f elevado a quadrado = %.1f\n", x, b);
        System.out.printf("5 elevado ao quadrado 2 = %.1f\n", c);

        a = Math.abs(y);
        b = Math.abs(z);

        System.out.printf("O valor absoluto de %.1f é %.1f\n", y, a);
        System.out.printf("O valor absoluto de %.1f é %.1f\n", z, b);
    }
}
