package com.company.walescko.cap07;

import java.util.Scanner;

public class Calculadora {//Calculadora outra vez... em java...

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        int numeroA, numeroB;
        char opcao;
        String escolha, saida ="";

        System.out.println("Exemplo Capítulo 07 - Estruturas Aninhadas - Calculadora");
        System.out.println("Digite dois numeros e a operação (+, -, * , /):");
        System.out.print("Numero A: ");
        numeroA = scan.nextInt();
        System.out.print("Numero B: ");
        numeroB = scan.nextInt();
        System.out.print("Escolha a operacao: ");
        escolha = scan.next();
        opcao = escolha.charAt(0);

        switch(opcao){
            case '+': saida += + numeroA + " + " + numeroB + " = " + (numeroA + numeroB); break;
            case '-': saida += + numeroA + " - " + numeroB + " = " + (numeroA - numeroB); break;
            case '*': saida += + numeroA + " * " + numeroB + " = " + (numeroA * numeroB); break;
            case '/': {
                if (numeroB == 0) {
                    saida = "A operacao nao pode ser realizada";
                } else {
                    saida += +numeroA + " / " + numeroB + " = " + (numeroA / numeroB);
                }
                break;
            }
            default: saida = "Operacao Invalida";
        }
        System.out.println(saida);
    }
}
