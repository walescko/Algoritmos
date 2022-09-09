package com.company.walescko.cap08;

import java.util.Scanner;

public class MultiploWhile {
    public static void main(String[] args){
        int numero, soma, multiplo, i=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero = scan.nextInt();
        System.out.printf("Valor Lido: %s", numero);
        System.out.println("Lista de Multiplos: ");

        soma = 0;

        while (i <= 10){
            multiplo = i*numero;
            System.out.printf(" %s", multiplo);
            soma += multiplo;
            i++;
        }

        System.out.printf("Soma = %s", soma);

    }
}