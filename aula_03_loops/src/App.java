import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Loops
        // For
        int[] numeros = {1,2,3,4,5,6,7};

        String[] nomesArray = new String[10];

        nomesArray[0] = "mario";
        nomesArray[2] = "joao";
        nomesArray[4] = "sergio";


        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("joao");              
        nomes.add("maria");              
        nomes.add("jose");              
        nomes.add("tonho");              
        nomes.add("jaco");              

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        for (int numero: numeros) {
            System.out.println(numero);
        }

        for (String nome: nomesArray) {
            System.out.println(nome);
        }

        // While

        int contador = 0;
        while (contador < 10) {
            System.out.println(contador + " Estou no While");
            contador++;
        }
        
        int contador2 = 0;
        do {
            System.out.println(contador2 + " Estou no Do While");
            contador2++;
        } while (contador2 < 10);
    }
}
