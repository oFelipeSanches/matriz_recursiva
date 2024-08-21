package org.example;

public class Matriz {

    public static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];

        int valor=1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor++;
            }
        }
        return matriz;
    }

    public static void exibirMatriz(int[][] matriz, int linha, int coluna) {

        if (linha >= matriz.length || coluna >= matriz[linha].length) {
            return;
        }

        System.out.print(matriz[linha][coluna] + " ");

        exibirMatriz(matriz, linha, coluna + 1);

        if (coluna == matriz[linha].length - 1) {
            System.out.println();
            exibirMatriz(matriz, linha + 1, 0);
        }
    }
}
