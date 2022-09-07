package com.company.walescko.cap06;

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args){

        int numero1, numero2, maior, menor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Maior e Menor - exemplo Cap 06 - p. 167");
        System.out.println("Digite dois números inteiros:");
        System.out.print("A: ");
        numero1 = scan.nextInt();
        System.out.print("B: ");
        numero2 = scan.nextInt();

        if(numero1 > numero2){
            maior = numero1;
            menor = numero2;
        } else {
            maior = numero2;
            menor = numero1;
        }

        System.out.println("Números lidos: " + numero1 + " e " + numero2);
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
    }
}
