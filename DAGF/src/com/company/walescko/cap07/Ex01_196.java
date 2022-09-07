package com.company.walescko.cap07;

import java.util.Scanner;

public class Ex01_196 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int number01, number02, number03, major, smaller;

        System.out.println("Maior e Menor de três");
        System.out.println("Entre com três valores inteiros: ");
        System.out.print("a = ");
        number01 = scan.nextInt();
        System.out.print("b = ");
        number02 = scan.nextInt();
        System.out.print("c = ");
        number03 = scan.nextInt();

        System.out.printf("Os números digitado são: %s, %s e %s", number01, number02, number03);
        if (number01 > number02 && number01 > number03){
            major = number01;
        } else if (number02 > number03 && number02 > number01){
            major = number02;
        } else {
            major = number03;
        }
        System.out.printf("\nO número maior é %s", major);

        if (number01 < number02 && number01 < number03){
            smaller = number01;
        } else if (number02 < number03 && number02 < number01){
            smaller = number02;
        } else {
            smaller = number03;
        }

        System.out.printf("\nO número menor é %s", smaller);

    }
}
