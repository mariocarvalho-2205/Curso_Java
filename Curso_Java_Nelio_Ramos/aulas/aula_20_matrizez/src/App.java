import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Matrizez!");

        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        System.out.print("Digite a quantidade de linhas: ");
        linha = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a quantidade de colunas: ");
        coluna = sc.nextInt();
        sc.nextLine();

        int[][] mat = new int[linha][coluna];

        for(int l = 0; l < mat.length; l++) {
            for(int c = 0; c < mat[l].length; c++) {
                System.out.printf("Digite o valor para a linha %d e para a coluna %d", l, c);
                mat[l][c] = sc.nextInt();
            }
        }

        System.out.println("Diagonal");
        for(int i = mat.length; i >= 0; i--) {
            System.out.println(mat[i][i]);
        }

        int negativos = 0;


        
        System.out.print("Negativos: ");
        for(int l = 0; l < mat.length; l++) {
            for(int c = 0; c < mat[l].length; c++) {
                if(mat[l][c] < 0) {
                    negativos++;
                }
            }
        }
        System.out.println(negativos);

        // for(int l = 0; l < linha; l++) {
        //     for(int c = 0; c < coluna; c++) {
        //         System.out.print(mat[l][c]);
        //     }
        //     System.out.println("");
        // }
        sc.close();
    }
}
