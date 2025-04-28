public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("For Each!");

        String[] vect = new String[] {"maria", "joao", "paulo"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("---------");
        for (Object nome : vect) {
            System.out.println(nome);
        }
    }
}
