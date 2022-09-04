package com.company.walescko.cap05;

import java.util.Scanner;

public class Ex01_147 {

    public static void  main(String[] args){
         int number01, number02;
         double result01,result02;

        Scanner scan = new Scanner(System.in);

        System.out.println("Exercício 01, Capítulo 05");
        System.out.print("Digite um valor inteiro: ");
        number01 = scan.nextInt();
        System.out.print("Digite um segundo valor: ");
        number02 = scan.nextInt();
        if (number01 > 50 || number02 > 50){
            do {
                System.out.print("Digite um valor inteiro:");
                number01 = scan.nextInt();
                System.out.print("Digite um segundo valor");
                number02 = scan.nextInt();
            } while(number01 > 50 || number02 > 50);
        }

        result01 = number01 + number02/100;
        result02 = (number01+number02)/100;

        System.out.println("Numero a = " + number01);
        System.out.println("Numero b = " + number02);
        System.out.println("Numero r1 = " + result01);
        System.out.println("Numero r2 = " + result02);


    }
}
