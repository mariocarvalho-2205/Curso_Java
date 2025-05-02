import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ecercicios Listas - Praticas!");

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Jose");

        System.out.println(nomes);

        nomes.add("Zeze");

        nomes.set(0, "Joaozinho");

        System.out.println(nomes);

        nomes.remove(3);
        nomes.remove("Jose");
        nomes.add("Jose");

        System.out.println(nomes);
        System.out.println(nomes.size());
        System.out.println(nomes.contains("Jose"));

        ArrayList<String> nomeFiltrado = (ArrayList<String>) nomes.stream()
                .filter(nome -> nome.startsWith("J"))
                .collect(Collectors.toList());
        // startsWith("M") verifica se o nome inicia com a string passada
        

        for (String nome : nomes) {
            // System.out.println(nome.startsWith("M"));
            if (nome.startsWith("M")) {
                nomeFiltrado.add(nome);

            }
        }
        System.out.println(nomeFiltrado);

        ArrayList<Integer> idades = new ArrayList<Integer>();

        idades.add(5);
        idades.add(15);
        idades.add(18);
        idades.add(50);
        idades.add(35);
        idades.add(28);
        idades.add(12);

        int menor18 = idades.stream().min(Comparator.naturalOrder()).get();
        System.out.println(menor18);
    }
}
