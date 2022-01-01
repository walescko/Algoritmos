package com.company.walescko.cap05;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args){

        int numeroInteiro;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        numeroInteiro = scan.nextInt();
        System.out.println("\nO numero digitado eh: " + numeroInteiro);
    }
}
