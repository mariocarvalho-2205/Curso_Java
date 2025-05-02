import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Loja Virtual JavaBank Store!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> estoque = new ArrayList<>();


            estoque.add(new Produto("Notebook", 3500.00));
            estoque.add(new Produto("Mouse", 120.00));
            estoque.add(new Produto("Teclado", 250.00));
            estoque.add(new Produto("Monitor", 800.00));
            estoque.add(new Produto("Cadeira Gamer", 1300.00));
            estoque.add(new Produto("Webcam", 200.00));
            estoque.add(new Produto("Fone de Ouvido", 300.00));
            
            for(int i =0; i < estoque.size(); i++) {
                System.out.printf("Cod: %d - Produto - %-20s R$ %8.2f\n", i + 1, estoque.get(i).getNome(), estoque.get(i).getPreco());
            };
            
            boolean n = true;
            int cod;
            
            List<Produto> carrinho = new ArrayList<>();
            while (n) {
                System.out.println("Escolha a opção desejada:");
                System.out.print("1 - Adicionar no Carrinho\n2 - Finalizar a Compra\n3 - Sair\n");
                int op = sc.nextInt();
                sc.nextLine();
                if (op == 1) {
                    System.out.print("Digite o codigo do produto escolhido: ");
                    cod = sc.nextInt();
                    sc.nextLine();
                    carrinho.add(estoque.get(cod - 1));

                } else if (op == 2){
                    System.out.print("Finalizando a Compra: \n");
                    
                    double total = carrinho.stream().mapToDouble(Produto::getPreco).sum();
                    double desconto = total > 1000 ? total * 0.1: 0;
                    double totalComDesconto = total - desconto;
                    double frete = totalComDesconto > 2000 ? 0 : 50.00;
                    double totalFinal = totalComDesconto + frete;

                    List<Produto> top3 = estoque.stream()
                    .sorted(Comparator.comparing(Produto::getPreco)
                    .reversed()).limit(3)
                    .collect(Collectors.toList());

                    System.out.println("=== Carrinho ===");
                    carrinho.forEach(System.out::println);
                    System.out.printf("\nSubtotal: R$ %.2f", total);
                    System.out.printf("\nDesconto: R$ %.2f", desconto);
                    System.out.printf("\nFrete: R$ %.2f", frete);
                    System.out.printf("\nTotal final: R$ %.2f", totalFinal);
            
                    System.out.println("\n=== RECOMENDADOS ===");

                    top3.forEach(System.out::println);
                    
                    
                    n = false;
             

                }else if (op == 3){
                    System.out.println("Obrigado e volte sempre!");
                    break;

                }  else {
                    System.out.println("Opção invalida");
                }
            }
            


            sc.close();
    }
}
