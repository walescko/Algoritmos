package com.company.walescko.cap08;

import java.util.Scanner;

public class MultiploFor {
    public static void main(String[] args){
        int numero, soma, multiplo;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero = scan.nextInt();
        System.out.printf("Valor Lido: %s", numero);
        System.out.println("Lista de Multiplos: ");

        soma = 0;

        for (int i; i <= 10; i++){
            multiplo = i*numero;
            System.out.printf(" %s", multiplo);
            soma += multiplo;
        }

        System.out.printf("Soma = %s", soma);

    }
}
