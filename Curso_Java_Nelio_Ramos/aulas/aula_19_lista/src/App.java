import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("List!");

        List<String> list = new ArrayList<>();

        list.add("mario");
        list.add("mario");
        list.add("mario");
        list.add("mario");
        list.add("Joao");
        list.add("Sergio");
        list.add(1, "Ady");
        System.out.println("----------------------------");

        System.out.println("index of " + list.indexOf("Sergio"));
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------");
        // remover
        // list.remove("mario"); // remove comparando o valor
        // list.remove(2); // remove pelo indice
        list.removeIf(x -> x.charAt(0) == 'J'); // remove pelo predicado
        

        // filtrar a lista com dados especificos
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());
        
        // primeiro elemento especifico
        String name = list.stream().filter(x -> x.charAt(0) == 'o').findFirst().orElse(null);
        System.out.println("-----find First ----------------");
        System.out.println(name);



        System.out.println("-----Result-----------");
        for (String x : result) {
            System.out.println(x);
        }
        
        System.out.println("----------------------------");
        // tamanho da lista
        System.out.println(list.size());



    }
}
