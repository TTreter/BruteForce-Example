package BruteForce.util;

public class ForcaBruta {

    public static void run(String[][] matriz, String valor) {
        // Obtém o tamanho do vetor.
        int n = matriz.length;
        // Procura pelo valor passado em cada posição da matriz, um a um.
        for (int b = 0; b < n; b++) {
            for (int i = 0; i < n; i++) {
                // Imprime um aviso com a posição sempre que um valor é encontrado.
                if (valor.equalsIgnoreCase(matriz[b][i])) {
                    System.out.println(
                            "VALOR ENCONTRADO NA POSIÇÂO " +
                                    (b + 1) + " X " + (i + 1) + "  " + matriz[b][i]
                    );
                    break;
                } else
                    // Chegou ao final da matriz.
                    if (b == n - 1 & i == n - 1) {
                        System.out.println("Busca encerrada!");
                    }
            }
        }

    }

}
