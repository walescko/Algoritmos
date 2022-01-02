package com.company.walescko.cap07;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args){

        int ladoA, ladoB, ladoC;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor dos lados do triangulo:");
        System.out.print("Lado A: ");
        ladoA = scan.nextInt();
        System.out.print("Lado B: ");
        ladoB = scan.nextInt();
        System.out.print("Lado C: ");
        ladoC = scan.nextInt();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            System.out.printf("As medidas: %s, %s e %s formam um triangulo ", ladoA, ladoB, ladoC);
            if (ladoA == ladoA && ladoA == ladoC){
                System.out.print("Equilatero.\n");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.print("Isóceles.\n");
            } else {
                System.out.print("Escaleno.\n");
            }
        } else {
            System.out.printf("As medidas: %s, %s e %s não formam um triangulo.", ladoA, ladoB, ladoC);
        }

    }
}
