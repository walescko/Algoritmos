package com.company.walescko.cap06;

import java.util.Scanner;

public class Ex01_170 {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Número par?");
        System.out.print("Digite um número inteiro: ");
        number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.printf("O número %s é par",number);
        } else {
            System.out.printf("O número %s é ímpar!", number);

        }
    }
}
