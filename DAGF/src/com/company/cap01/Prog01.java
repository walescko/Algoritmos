package com.company.cap01;

import java.util.Scanner;

public class Prog01 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int x, y;

        System.out.print("Digite um número: ");
        x = scan.nextInt();
        System.out.print(("Digite outro número: "));
        y = scan.nextInt();

        if (x > y) {
            System.out.println("Esse é o maior " + x);
        } else {
            System.out.println("Esse é o maior " + y);
        }
    }
}
