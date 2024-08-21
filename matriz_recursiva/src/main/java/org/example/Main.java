package org.example;

import static org.example.Matriz.criarMatriz;
import static org.example.Matriz.exibirMatriz;

public class Main {
    public static void main(String[] args) {

        int linhas = 4;
        int colunas = 4;
        int[][] matriz = criarMatriz(linhas, colunas);

        System.out.println("Matriz criada:");
        exibirMatriz(matriz, 0, 0);

    }
}