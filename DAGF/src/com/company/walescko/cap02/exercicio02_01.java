package com.company.walescko.cap02;

import java.util.Scanner;

public class exercicio02_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.print("Digite um número: ");
        x = scan.nextInt();
        System.out.print("Digite outro número: ");
        y = scan.nextInt();

        if (x < y) {
            System.out.println("Esse é o menor " + x);
        } else {
            System.out.println("Esse é o menor " + y);
        }
    }
}
