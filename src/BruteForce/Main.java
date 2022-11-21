package BruteForce;

import BruteForce.util.ForcaBruta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Define uma matriz 5x5.
        String[][] MATRIZ = new String[5][5];
        // Variável que recebe dados digitados.
        Scanner INPUT = new Scanner(System.in);
        // Variável da operação ativa.
        boolean OP = true;

        // Enquanto a operação está ativa, mais valores serão inseridos.
        while (OP) {
            // Recebe a linha em que o elemento será inserido.
            System.out.println("Digite a operacao:");
            System.out.println("1 • Em qual linha o elemente deve ser inserido?");
            int LINHA = INPUT.nextInt();
            LINHA--;
            // Recebe a coluna em que o elemento será inserido.
            System.out.println("2 • Em qual coluna o elemento deve ser inserido?");
            int COLUNA = INPUT.nextInt();
            COLUNA--;
            // Recebe o elemento a ser inserido na matriz.
            System.out.println("\nInsira o elemento: (Ou digite N para sair.)");
            String ESCOLHA = INPUT.next();
            // Se o valor inserido for "N", encerra a inserção de elementos.
            if (ESCOLHA.equalsIgnoreCase("n")) {
                OP = false;
            } else {
                // Insere o elemento na posição escolhida.
                MATRIZ[LINHA][COLUNA] = ESCOLHA;
            }
        }

        // Define a operação como verdadeira para iniciar a busca.
        OP = true;
        // Enquanto a operação está ativa, mais valores podem ser buscados.
        while (OP) {
            // Recebe um valor para ser procurado na matriz.
            System.out.println("\nInsira o valor a ser buscado na matriz:");
            String valor = INPUT.next();
            // Faz a busca atrávez de um metodo de Força Bruta.
            ForcaBruta.run(MATRIZ, valor);
            // Verifica se o utilizador deseja continuar a fazer outra busca.
            System.out.println("\nContinuar buscando? (Digite N para sair.)");
            String escolha = INPUT.next();
            // Se a inserção for a letra "N", encerra o programa.
            if (escolha.equalsIgnoreCase("n")) {
                OP = false;
            }
        }
    }
}
