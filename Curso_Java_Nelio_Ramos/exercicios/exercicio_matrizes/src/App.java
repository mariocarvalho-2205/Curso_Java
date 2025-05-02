import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio Matrizes!");

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
                System.out.printf("Digite o valor para a linha %d e para a coluna %d: ", l, c);
                mat[l][c] = sc.nextInt();
                sc.nextLine();
            }
        }
        for(int l = 0; l < mat.length; l++) {
            for(int c = 0; c < mat[l].length; c++) {
                System.out.printf(" %d  ", mat[l][c]);
                
            }
            System.out.println();
        }

        System.out.print("digite um numero para a pesquisa: ");
        int x = sc.nextInt();
        sc.nextLine();
        
        for(int l = 0; l < mat.length; l++) {
            for(int c = 0; c < mat[l].length; c++) {
                if(mat[l][c] == x) {
                    System.out.printf("Posição de %d é na linha %d e coluna %d\n", x, l, c);
                    if(c > 0) {
                        System.out.println("Left: " + mat[l][c - 1]);
                    }
                    if(l > 0) {
                        System.out.println("Up: " + mat[l - 1][c]);

                    }
                    if(c < mat[l].length-1) {
                        System.out.println("Right: " + mat[l][c + 1]);

                    }
                    if(l < mat.length-1) {
                        System.out.println("Down: " + mat[l + 1][c]);

                    }
                }        
                
            }
        }





        sc.close();
    }
}
