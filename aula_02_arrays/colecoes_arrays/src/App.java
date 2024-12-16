import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Coleção de inteiros = array
        // |O tamanho do array e definido na criação dele
        // caso nao seja definido, ele inrefe o tamanho de acordo com a quantidade de elementos
        // ou itens contidos no array
        // não sendo possivél incluir mais nada depois da criação do array
        int[] colecaoInteiros = {1, 2, 3, 4, 5, 6};

        // para definir o tamanho do array, é necessário usar o new
        // e passar o tamanho do array como parâmetro
        int[] colecaoInteiros2 = new int[6];
        // adicionando items nas posições
        colecaoInteiros2[0] = 1;
        colecaoInteiros2[1] = 2;

        // E necessario a importação da classe ArrayList para utilizar
        // Para criarmos um Array com tamanho dinamico, ou seja sem limite
        // é necessário usar o ArrayList
        // ArrayList é uma coleção de objetos que pode ser alterada dinamicamente
        // ou seja, podemos adicionar ou remover elementos a qualquer momento
        // sem precisar saber o tamanho da coleção antes de criar ela
        // sintaxe: 
        // ArrayList<Tipo> nomecolecao = new ArrayList<>();
        ArrayList<String> colecaoInteiros3 = new ArrayList<String>();
        // para adicionar items no array, usamos o método add
        colecaoInteiros3.add("mario");
        colecaoInteiros3.add("sergio");
        colecaoInteiros3.add("tonho");
        colecaoInteiros3.add("maria");

        System.out.println(colecaoInteiros[0]);
        System.out.println(colecaoInteiros.length);
        System.out.println(colecaoInteiros3);
        
        // para acessar cada item utilizamos o metodo get() e o indice do item exemplo
        // colecaoInteiros.get(0)
        System.out.println(colecaoInteiros3.get(0));
        // para remover o item utilizamos o remove, exemplo
        // podemos remover pelo indece ou pelo conteudo do indice, exemplo: colecaoInteiros3.remove("mario");
        colecaoInteiros3.remove(1);
        colecaoInteiros3.remove("tonho");
        System.out.println(colecaoInteiros3);

    }
}
