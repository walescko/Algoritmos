package com.company.cap05;

import java.util.Scanner;

public class Quadrilatero {

    public static void main(String[] args) {

        int base, altura, area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da base .....: ");
        base = scan.nextInt();
        System.out.print("Digite o valor da altura ...: ");
        altura = scan.nextInt();

        area = base*altura;
        System.out.println("Area do quadrilatero = " + area);

    }
}
