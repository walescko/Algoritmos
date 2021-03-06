//Leitura de valores pelo console para monter duas matrizes 5x5
//Realizar a soma delas elemento a elemento e mostrar as três matrizes na tela.

package com.company.walescko.cap10;

import java.util.Scanner;

public class Ex02_322 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Integer matriz[][][];
        Integer somaMatriz[][];
        int k, n, m; //tamanho da matriz

        System.out.print("Qual a quantidade de linhas das matrizes? ");
        n = scan.nextInt();
        System.out.print("Qual a quantidade de colunas das matrizes? ");
        m = scan.nextInt();
        System.out.println("\nAs matrizes terão " + n + " linhas e " + m + " colunas.");

        matriz = new Integer[2][n][m];

        for (k = 0; k < 2; k++){
            System.out.println("Entre com os valores da Matriz " + k+1);
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    System.out.print("Entre com o elemento " + (i+1) + (j+1) + ": ");
                    matriz[k][i][j] = scan.nextInt();
                }
            }
        }

        for (k = 0 ; k < 2 ; k++){
            System.out.println("Matriz " + (k+1) + ":");
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m ; j++){
                        System.out.print(matriz[k][i][j] + " ");
                    }
                    System.out.println();
                }
        }

        somaMatriz = new Integer[n][m];

        k=0;
        for (int i = 0; i <n ; i++){
            for (int j = 0; j < m ; j++){
                somaMatriz[i][j] = matriz[k][i][j] + matriz[k+1][i][j];
            }
        }

        System.out.println("Soma das Matrizes 1 e 2:");
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < m ; j++){
                System.out.print(somaMatriz[i][j] + " ");
            }
            System.out.println();
        }



    }
}

