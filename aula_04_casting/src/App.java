public class App {
    public static void main(String[] args) throws Exception {
       
        // casting é quando convertemos o tipo valor de uma variavel em outro tipo
        // casting implicito
        // Exemplo: double num1 = 10.2
        // int num = (int)num1;

        // double for int
        double salario = 1.50;
        int salarioInteiro =  (int) salario;

        System.out.println(salario);
        System.out.println(salarioInteiro);

        // int for double
        int simples = 10;
        double duplo = simples;

        System.out.println(simples);
        System.out.println(duplo);

       // string for int
       String idade = "10";
       int idade2 =  Integer.parseInt(idade);

       // int for String
       int meunumero = 71918705;
       String cel = String.valueOf(meunumero);

       System.out.println(cel);
    }
}