public class App {
    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 10;
        String nome = "mario";

        // Estruturas condicionais
        if (a < b) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // modos de comparar String
        // nome.equals("João") - retorna um booleano
        // nome.isBlank() - verifica se e vazia
        if ("João" == nome) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }

        if (nome.equals("João")) {
            System.out.print("verdadeiro");
        } else if (nome.isBlank()) {
            System.out.print("vazio");
        } else {
            System.out.println("falso!");
        }
    }
}
